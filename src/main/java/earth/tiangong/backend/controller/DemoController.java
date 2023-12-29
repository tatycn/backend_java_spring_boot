package earth.tiangong.backend.controller;

import static org.springframework.http.ResponseEntity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import earth.tiangong.backend.entity.DemoEmployee;
import earth.tiangong.backend.model.DemoEmployeeGridFilter;
import earth.tiangong.backend.model.GridData;
import earth.tiangong.backend.service.IDemoEmployeeService;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TianGong
 * @since 2023-12-27
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
@Autowired
    private IDemoEmployeeService iDemoEmployeeService;

    @ApiOperation(value = "demo/create")
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody DemoEmployee data) {
        return ok(iDemoEmployeeService.create(data));
    }

    @ApiOperation(value = "demo/update")
    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody DemoEmployee data) {
        return ok(iDemoEmployeeService.update(data));
    }

    @ApiOperation(value = "demo/delete/{id}")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        return ok(iDemoEmployeeService.delete(id));
    }

    @ApiOperation(value = "demo/get/{id}")
    @GetMapping("/get/{id}")
    public ResponseEntity<DemoEmployee> get(@PathVariable String id) {
        return ok(iDemoEmployeeService.getById(id));
    }

    // @PreAuthorize("@ss.hasAnyRoles( 'admin,user' )")
    @ApiOperation(value = "demo/grid")
    @GetMapping("/grid")
    public ResponseEntity<GridData<DemoEmployee>> getGrid(DemoEmployeeGridFilter filter) throws Exception {
        filter = filter == null ? new DemoEmployeeGridFilter() : filter;
        return ok(iDemoEmployeeService.getGrid(filter));
    }

}

package earth.tiangong.backend.generator;

import java.sql.SQLException;
import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class FastGeneratorDM {
    // /**
    // * DB Config
    // */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig.Builder
    ("jdbc:dm://localhost/DTRZ", "SYSDBA", "SYSDBA");

    /**
     * Run
     */
    public static void main(String[] args) throws SQLException {
        FastAutoGenerator.create(DATA_SOURCE_CONFIG).globalConfig(builder -> {
            builder.author("TianGong").fileOverride() // force overwrite files
                    .outputDir("src/main/java/");
        }).packageConfig(builder -> {
            builder.parent("earth.tiangong.lca.backend").pathInfo(Collections.singletonMap(OutputFile.mapperXml, "src/main/resources/mapper"));
        }).strategyConfig(builder -> {
            builder.enableSchema().addInclude("demo_employee");

            // builder.addInclude("elcd__processes"); // table name
            // .addTablePrefix("elcd_"); // table filter
        }).templateEngine(new FreemarkerTemplateEngine()).execute();
    }
}

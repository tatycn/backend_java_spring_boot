package earth.tiangong.backend.generator;

import java.sql.SQLException;
import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class FastGeneratorPG {

    /**
     * DB Config
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig.Builder(
            "jdbc:postgresql://10.166.168.98:5432/HYCX.Noise.HuiZhou?currentSchema=public", "user_CWJa4j",
            "password_5ixtNx");

    /**
     * Run
     */
    public static void main(String[] args) throws SQLException {
        FastAutoGenerator.create(DATA_SOURCE_CONFIG).globalConfig(builder -> {
            builder.author("TianGong")
                    // .fileOverride() // force overwrite files
                    .outputDir("src/main/java/");
        }).packageConfig(builder -> {
            builder.parent("earth.tiangong.backend")
                    .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "src/main/resources/mapper"));
        }).strategyConfig(builder -> {
            builder.enableSchema()
                    // .addInclude("demo_employee");
                    // builder.addInclude("elcd__processes"); // table name
                    .addTablePrefix("t_"); // table filter
        }).templateEngine(new FreemarkerTemplateEngine()).execute();
    }
}

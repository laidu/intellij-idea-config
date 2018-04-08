#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
/**
 * ${Description}
 *
 * Created by tiancai.zang 
 * on ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}.
 */
public class ${NAME}{
    private static ${NAME} ourInstance = new ${NAME}();

    public static ${NAME} getInstance() {
        return ourInstance;
    }

    private ${NAME}() {
    }
}

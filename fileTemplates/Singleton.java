#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
/**
 * ${Description}
 *
 * Created by ${USER} 
 * on ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}.
 * @author ${USER}
 */
public enum ${NAME}{
    private static ${NAME} ourInstance = new ${NAME}();

    public static ${NAME} getInstance() {
        return ourInstance;
    }

    private ${NAME}() {
    }
}
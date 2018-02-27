#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
/**
 * ${DESCRIPTION}
 * 
 * Created by tiancai.zang on ${YEAR}-${MONTH}-${DAY} ${HOUR}-${MINUTE}.
 */
@Slf4j
public class ${NAME} {  
    private static class ${NAME}Holder {  
        private static final ${NAME} INSTANCE = new ${NAME}();  
    }  
    private ${NAME} (){}  
    public static final ${NAME} getInstance() {  
        return ${NAME}Holder.INSTANCE; 
    }  
}
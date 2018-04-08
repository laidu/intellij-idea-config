#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set($name=${NAME.toLowerCase()}+${PACKAGE_NAME.toLowerCase()})
#set($slf4j=${name.contains("controller")} || ${name.contains("impl")} || ${name.contains("util")} || ${name.contains("test")})
#set($controller=${name.contains("controller")})
#set($service=${name.contains("impl")})
#set($data=${name.contains("dto")} || ${name.contains("entity")} || ${name.contains("model")})
#set($test=${name.contains("test")})

#if ($slf4j || !$data) import lombok.extern.slf4j.Slf4j;#end
#if ($service) import org.springframework.stereotype.Service;#end
#if ($controller)import org.springframework.web.bind.annotation.RestController;import org.springframework.web.bind.annotation.RequestMapping;#end
#if ($data) import lombok.AllArgsConstructor;import lombok.Builder;import lombok.Data;import lombok.NoArgsConstructor;#end
/**
 * ${Description}
 *
 * Created by tiancai.zang 
 * on ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}.
 */
#if ($slf4j || !$data) @Slf4j #end
#if ($controller) @RestController@RequestMapping("/") #end
#if ($service) @Service #end
#if ($data) @Data@Builder@AllArgsConstructor@NoArgsConstructor #end
public class ${NAME} {

}
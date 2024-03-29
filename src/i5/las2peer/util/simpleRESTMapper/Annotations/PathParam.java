package i5.las2peer.util.simpleRESTMapper.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//for data in URI /Users/{UserID}/photos/{PhotoID}...
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface PathParam {
	String value();
}

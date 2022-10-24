package annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface MyAnno 
{
       String maker() default "Seed Infotech";
       String desc();
}

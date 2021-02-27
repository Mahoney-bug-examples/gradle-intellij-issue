import org.gradle.api.attributes.Attribute

val java: Class<String> = String::class.java
val attr = Attribute.of("", java)
fun foo() {
    java.name
    attr
}

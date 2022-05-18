package io.swagger.models.parameters;

public class PathParameter extends AbstractSerializableParameter<PathParameter> {

    public PathParameter() {
        super.setIn("path");
        super.setRequired(true);
    }

    @Override
    public String toString() {
        return "PathParameter{" +
                "type='" + type + '\'' +
                ", format='" + format + '\'' +
                ", collectionFormat='" + collectionFormat + '\'' +
                ", items=" + items +
                ", exclusiveMaximum=" + exclusiveMaximum +
                ", maximum=" + maximum +
                ", exclusiveMinimum=" + exclusiveMinimum +
                ", minimum=" + minimum +
                ", example='" + example + '\'' +
                ", allowEmptyValue=" + allowEmptyValue +
                ", _enum=" + _enum +
                ", maxLength=" + maxLength +
                ", minLength=" + minLength +
                ", pattern='" + pattern + '\'' +
                ", uniqueItems=" + uniqueItems +
                ", multipleOf=" + multipleOf +
                ", defaultValue='" + defaultValue + '\'' +
                ", in='" + in + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", required=" + required +
                ", access='" + access + '\'' +
                ", pattern='" + pattern + '\'' +
                ", readOnly=" + readOnly +
                '}';
    }
}

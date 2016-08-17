//
// This file generated by rdl 1.4.8
//

package com.yahoo.rdl;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// Type - A Type can be specified by any of the above specialized Types,
// determined by the value of the the 'type' field
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonDeserialize(using = Type.TypeJsonDeserializer.class)
public final class Type {
    public enum TypeVariant {
        BaseType,
        StructTypeDef,
        MapTypeDef,
        ArrayTypeDef,
        EnumTypeDef,
        UnionTypeDef,
        StringTypeDef,
        BytesTypeDef,
        NumberTypeDef,
        AliasTypeDef
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public TypeVariant variant;

    @RdlOptional public BaseType BaseType;
    @RdlOptional public StructTypeDef StructTypeDef;
    @RdlOptional public MapTypeDef MapTypeDef;
    @RdlOptional public ArrayTypeDef ArrayTypeDef;
    @RdlOptional public EnumTypeDef EnumTypeDef;
    @RdlOptional public UnionTypeDef UnionTypeDef;
    @RdlOptional public StringTypeDef StringTypeDef;
    @RdlOptional public BytesTypeDef BytesTypeDef;
    @RdlOptional public NumberTypeDef NumberTypeDef;
    @RdlOptional public AliasTypeDef AliasTypeDef;
    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Type.class) {
                return false;
            }
            Type a = (Type) another;
            if (variant == a.variant) {
                switch (variant) {
                case BaseType:
                    return BaseType.equals(a.BaseType);
                case StructTypeDef:
                    return StructTypeDef.equals(a.StructTypeDef);
                case MapTypeDef:
                    return MapTypeDef.equals(a.MapTypeDef);
                case ArrayTypeDef:
                    return ArrayTypeDef.equals(a.ArrayTypeDef);
                case EnumTypeDef:
                    return EnumTypeDef.equals(a.EnumTypeDef);
                case UnionTypeDef:
                    return UnionTypeDef.equals(a.UnionTypeDef);
                case StringTypeDef:
                    return StringTypeDef.equals(a.StringTypeDef);
                case BytesTypeDef:
                    return BytesTypeDef.equals(a.BytesTypeDef);
                case NumberTypeDef:
                    return NumberTypeDef.equals(a.NumberTypeDef);
                case AliasTypeDef:
                    return AliasTypeDef.equals(a.AliasTypeDef);
                }
            }
        }
        return false;
    }


    public static class TypeJsonDeserializer extends JsonDeserializer<Type> {
        @Override
        public Type deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonToken tok = jp.nextToken();
            if (tok != JsonToken.FIELD_NAME) {
                throw new IOException("Cannot deserialize Type - no valid variant present");
            }
            String svariant = jp.getCurrentName();
            tok = jp.nextToken();
            Type t = null;
            if (tok == JsonToken.VALUE_STRING) {
                switch (svariant) {
                case "BaseType":
                    t = new Type(com.yahoo.rdl.BaseType.fromString(jp.getText()));
                    break;
                default:
                    throw new IOException("Cannot deserialize Type - bad type variant: " + svariant);
                }
                tok = jp.nextToken();
                return t;
            }
            if (tok == JsonToken.START_OBJECT) {
                switch (svariant) {
                case "StructTypeDef":
                    t = new Type(jp.readValueAs(StructTypeDef.class));
                    break;
                case "MapTypeDef":
                    t = new Type(jp.readValueAs(MapTypeDef.class));
                    break;
                case "ArrayTypeDef":
                    t = new Type(jp.readValueAs(ArrayTypeDef.class));
                    break;
                case "EnumTypeDef":
                    t = new Type(jp.readValueAs(EnumTypeDef.class));
                    break;
                case "UnionTypeDef":
                    t = new Type(jp.readValueAs(UnionTypeDef.class));
                    break;
                case "StringTypeDef":
                    t = new Type(jp.readValueAs(StringTypeDef.class));
                    break;
                case "BytesTypeDef":
                    t = new Type(jp.readValueAs(BytesTypeDef.class));
                    break;
                case "NumberTypeDef":
                    t = new Type(jp.readValueAs(NumberTypeDef.class));
                    break;
                case "AliasTypeDef":
                    t = new Type(jp.readValueAs(AliasTypeDef.class));
                    break;
                default:
                    throw new IOException("Cannot deserialize Type - bad type variant: " + svariant);
                }
                if (t != null) {
                    tok = jp.nextToken();
                    if (tok == JsonToken.END_OBJECT) {
                        return t;
                    }
                    throw new IOException("Cannot deserialize Type - more than one variant present");
                }
            }
            throw new IOException("Cannot deserialize Type - no variant present");
        }
    }

    public Type() {
    }

    public Type(BaseType baseType) {
        this.variant = TypeVariant.BaseType;
        this.BaseType = baseType;
    }

    public Type(StructTypeDef structTypeDef) {
        this.variant = TypeVariant.StructTypeDef;
        this.StructTypeDef = structTypeDef;
    }

    public Type(MapTypeDef mapTypeDef) {
        this.variant = TypeVariant.MapTypeDef;
        this.MapTypeDef = mapTypeDef;
    }

    public Type(ArrayTypeDef arrayTypeDef) {
        this.variant = TypeVariant.ArrayTypeDef;
        this.ArrayTypeDef = arrayTypeDef;
    }

    public Type(EnumTypeDef enumTypeDef) {
        this.variant = TypeVariant.EnumTypeDef;
        this.EnumTypeDef = enumTypeDef;
    }

    public Type(UnionTypeDef unionTypeDef) {
        this.variant = TypeVariant.UnionTypeDef;
        this.UnionTypeDef = unionTypeDef;
    }

    public Type(StringTypeDef stringTypeDef) {
        this.variant = TypeVariant.StringTypeDef;
        this.StringTypeDef = stringTypeDef;
    }

    public Type(BytesTypeDef bytesTypeDef) {
        this.variant = TypeVariant.BytesTypeDef;
        this.BytesTypeDef = bytesTypeDef;
    }

    public Type(NumberTypeDef numberTypeDef) {
        this.variant = TypeVariant.NumberTypeDef;
        this.NumberTypeDef = numberTypeDef;
    }

    public Type(AliasTypeDef aliasTypeDef) {
        this.variant = TypeVariant.AliasTypeDef;
        this.AliasTypeDef = aliasTypeDef;
    }
}

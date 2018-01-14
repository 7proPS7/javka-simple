package com.props.tools.javkasimple.reflection.type;

import java.util.HashMap;
import java.util.Map;

public enum AccessType {
    PUBLIC(1), PROTECTED(4), PRIVATE(2), ABSTRACT(1024);

    private static Map map = new HashMap<>();

    static {
        for (AccessType accessType : AccessType.values()) {
            map.put(accessType.value, accessType);
        }
    }

    private int value;

    private AccessType(int value) {
        this.value = value;
    }

    public static AccessType valueOf(int accessTYpe) {
        return (AccessType) map.get(accessTYpe);
    }

    public int getAccessType() {
        return value;
    }
}

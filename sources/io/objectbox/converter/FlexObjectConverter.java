package io.objectbox.converter;

import id.a;
import id.b;
import id.c;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class FlexObjectConverter implements PropertyConverter<Object, byte[]> {
    private static final AtomicReference<c> cachedBuilder = new AtomicReference<>();

    private void addMap(c cVar, String str, Map<Object, Object> map) {
        int iIntValue;
        int iX = cVar.x();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalArgumentException("Map keys or values must not be null");
            }
            checkMapKeyType(key);
            String string = key.toString();
            if (value instanceof Map) {
                addMap(cVar, string, (Map) value);
            } else if (value instanceof List) {
                addVector(cVar, string, (List) value);
            } else if (value instanceof String) {
                cVar.w(string, (String) value);
            } else if (value instanceof Boolean) {
                cVar.k(string, ((Boolean) value).booleanValue());
            } else {
                if (value instanceof Byte) {
                    iIntValue = ((Byte) value).intValue();
                } else if (value instanceof Short) {
                    iIntValue = ((Short) value).intValue();
                } else if (value instanceof Integer) {
                    iIntValue = ((Integer) value).intValue();
                } else if (value instanceof Long) {
                    cVar.t(string, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    cVar.p(string, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    cVar.o(string, ((Double) value).doubleValue());
                } else {
                    if (!(value instanceof byte[])) {
                        throw new IllegalArgumentException("Map values of this type are not supported: " + value.getClass().getSimpleName());
                    }
                    cVar.i(string, (byte[]) value);
                }
                cVar.s(string, iIntValue);
            }
        }
        cVar.f(str, iX);
    }

    private void addValue(c cVar, Object obj) {
        int iIntValue;
        if (obj instanceof Map) {
            addMap(cVar, null, (Map) obj);
            return;
        }
        if (obj instanceof List) {
            addVector(cVar, null, (List) obj);
            return;
        }
        if (obj instanceof String) {
            cVar.v((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            cVar.l(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Byte) {
            iIntValue = ((Byte) obj).intValue();
        } else if (obj instanceof Short) {
            iIntValue = ((Short) obj).intValue();
        } else {
            if (!(obj instanceof Integer)) {
                if (obj instanceof Long) {
                    cVar.r(((Long) obj).longValue());
                    return;
                }
                if (obj instanceof Float) {
                    cVar.n(((Float) obj).floatValue());
                    return;
                }
                if (obj instanceof Double) {
                    cVar.m(((Double) obj).doubleValue());
                    return;
                } else {
                    if (obj instanceof byte[]) {
                        cVar.j((byte[]) obj);
                        return;
                    }
                    throw new IllegalArgumentException("Values of this type are not supported: " + obj.getClass().getSimpleName());
                }
            }
            iIntValue = ((Integer) obj).intValue();
        }
        cVar.q(iIntValue);
    }

    private void addVector(c cVar, String str, List<Object> list) {
        int iIntValue;
        int iY = cVar.y();
        for (Object obj : list) {
            if (obj == null) {
                throw new IllegalArgumentException("List elements must not be null");
            }
            if (obj instanceof Map) {
                addMap(cVar, null, (Map) obj);
            } else if (obj instanceof List) {
                addVector(cVar, null, (List) obj);
            } else if (obj instanceof String) {
                cVar.v((String) obj);
            } else if (obj instanceof Boolean) {
                cVar.l(((Boolean) obj).booleanValue());
            } else {
                if (obj instanceof Byte) {
                    iIntValue = ((Byte) obj).intValue();
                } else if (obj instanceof Short) {
                    iIntValue = ((Short) obj).intValue();
                } else if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof Long) {
                    cVar.r(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    cVar.n(((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    cVar.m(((Double) obj).doubleValue());
                } else {
                    if (!(obj instanceof byte[])) {
                        throw new IllegalArgumentException("List values of this type are not supported: " + obj.getClass().getSimpleName());
                    }
                    cVar.j((byte[]) obj);
                }
                cVar.q(iIntValue);
            }
        }
        cVar.g(str, iY, false, false);
    }

    private List<Object> buildList(b.k kVar) {
        Object objValueOf;
        int iB = kVar.b();
        ArrayList arrayList = new ArrayList(iB);
        Boolean boolValueOf = null;
        for (int i10 = 0; i10 < iB; i10++) {
            b.g gVarD = kVar.d(i10);
            if (gVarD.r()) {
                objValueOf = buildMap(gVarD.h());
            } else if (gVarD.t()) {
                objValueOf = buildList(gVarD.k());
            } else if (gVarD.s()) {
                objValueOf = gVarD.i();
            } else if (gVarD.n()) {
                objValueOf = Boolean.valueOf(gVarD.c());
            } else if (gVarD.p()) {
                if (boolValueOf == null) {
                    boolValueOf = Boolean.valueOf(shouldRestoreAsLong(gVarD));
                }
                objValueOf = boolValueOf.booleanValue() ? Long.valueOf(gVarD.g()) : Integer.valueOf(gVarD.e());
            } else if (gVarD.o()) {
                objValueOf = Double.valueOf(gVarD.d());
            } else {
                if (!gVarD.m()) {
                    throw new IllegalArgumentException("List values of this type are not supported: " + gVarD.getClass().getSimpleName());
                }
                arrayList.add(gVarD.b().d());
            }
            arrayList.add(objValueOf);
        }
        return arrayList;
    }

    private Map<Object, Object> buildMap(b.e eVar) {
        Object objValueOf;
        int iB = eVar.b();
        b.d dVarF = eVar.f();
        b.k kVarG = eVar.g();
        HashMap map = new HashMap((int) ((((double) iB) / 0.75d) + 1.0d));
        for (int i10 = 0; i10 < iB; i10++) {
            Object objConvertToKey = convertToKey(dVarF.a(i10).toString());
            b.g gVarD = kVarG.d(i10);
            if (gVarD.r()) {
                objValueOf = buildMap(gVarD.h());
            } else if (gVarD.t()) {
                objValueOf = buildList(gVarD.k());
            } else if (gVarD.s()) {
                objValueOf = gVarD.i();
            } else if (gVarD.n()) {
                objValueOf = Boolean.valueOf(gVarD.c());
            } else if (gVarD.p()) {
                objValueOf = shouldRestoreAsLong(gVarD) ? Long.valueOf(gVarD.g()) : Integer.valueOf(gVarD.e());
            } else if (gVarD.o()) {
                objValueOf = Double.valueOf(gVarD.d());
            } else {
                if (!gVarD.m()) {
                    throw new IllegalArgumentException("Map values of this type are not supported: " + gVarD.getClass().getSimpleName());
                }
                map.put(objConvertToKey, gVarD.b().d());
            }
            map.put(objConvertToKey, objValueOf);
        }
        return map;
    }

    protected void checkMapKeyType(Object obj) {
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("Map keys must be String");
        }
    }

    @Override // io.objectbox.converter.PropertyConverter
    public byte[] convertToDatabaseValue(Object obj) {
        if (obj == null) {
            return null;
        }
        AtomicReference<c> atomicReference = cachedBuilder;
        c andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new c(new a(512), 3);
        }
        addValue(andSet, obj);
        ByteBuffer byteBufferH = andSet.h();
        byte[] bArr = new byte[byteBufferH.limit()];
        byteBufferH.get(bArr);
        if (byteBufferH.limit() <= 262144) {
            andSet.c();
            atomicReference.getAndSet(andSet);
        }
        return bArr;
    }

    @Override // io.objectbox.converter.PropertyConverter
    public Object convertToEntityProperty(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        b.g gVarG = b.g(new a(bArr, bArr.length));
        if (gVarG.r()) {
            return buildMap(gVarG.h());
        }
        if (gVarG.t()) {
            return buildList(gVarG.k());
        }
        if (gVarG.s()) {
            return gVarG.i();
        }
        if (gVarG.n()) {
            return Boolean.valueOf(gVarG.c());
        }
        if (gVarG.p()) {
            return shouldRestoreAsLong(gVarG) ? Long.valueOf(gVarG.g()) : Integer.valueOf(gVarG.e());
        }
        if (gVarG.o()) {
            return Double.valueOf(gVarG.d());
        }
        if (gVarG.m()) {
            return gVarG.b().d();
        }
        throw new IllegalArgumentException("FlexBuffers type is not supported: " + gVarG.l());
    }

    Object convertToKey(String str) {
        return str;
    }

    protected boolean shouldRestoreAsLong(b.g gVar) {
        try {
            Field declaredField = gVar.getClass().getDeclaredField("parentWidth");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(gVar)).intValue() == 8;
        } catch (Exception e10) {
            throw new RuntimeException("FlexMapConverter could not determine FlexBuffers integer bit width.", e10);
        }
    }
}

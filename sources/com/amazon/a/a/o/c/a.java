package com.amazon.a.a.o.c;

import com.amazon.a.a.o.c;
import com.amazon.a.a.o.c.a.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f7488a = new c("Serializer");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f7489b = {com.amazon.a.a.b.c.class, String.class, HashMap.class, LinkedHashMap.class};

    public static <T> T a(String str) throws Throwable {
        f fVar;
        Object obj;
        InputStream inputStream = (T) null;
        if (str != null && str.length() != 0) {
            try {
                try {
                    try {
                        fVar = new f(new ByteArrayInputStream(com.amazon.c.a.a.c.c(str.getBytes())));
                    } catch (Exception e10) {
                        e = e10;
                        fVar = null;
                    } catch (Throwable th) {
                        th = th;
                        com.amazon.a.a.o.a.a(inputStream);
                        throw th;
                    }
                    try {
                        fVar.a(f7489b);
                        obj = (T) fVar.readObject();
                    } catch (Exception e11) {
                        e = e11;
                        obj = inputStream;
                        if (c.f7484b) {
                            f7488a.b("Could not read object from string: " + str, e);
                            obj = inputStream;
                        }
                    }
                    com.amazon.a.a.o.a.a(fVar);
                    return (T) obj;
                } catch (IOException e12) {
                    if (c.f7484b) {
                        f7488a.b("Could not decode string", e12);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = (T) fVar;
            }
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0042: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:22:0x0042 */
    public static String a(Serializable serializable) throws Throwable {
        ObjectOutputStream objectOutputStream;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        if (serializable == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e10) {
                e = e10;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                com.amazon.a.a.o.a.a(outputStream2);
                throw th;
            }
            try {
                objectOutputStream.writeObject(serializable);
                String strA = com.amazon.c.a.a.c.a(byteArrayOutputStream.toByteArray());
                com.amazon.a.a.o.a.a(objectOutputStream);
                return strA;
            } catch (IOException e11) {
                e = e11;
                if (c.f7484b) {
                    f7488a.b("Could not serialize object: " + serializable, e);
                }
                com.amazon.a.a.o.a.a(objectOutputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            com.amazon.a.a.o.a.a(outputStream2);
            throw th;
        }
    }
}

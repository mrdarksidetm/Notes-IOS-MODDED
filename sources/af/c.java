package af;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final Void a(he.c<?> cVar, he.c<?> cVar2) {
        ae.r.f(cVar, "subClass");
        ae.r.f(cVar2, "baseClass");
        String strB = cVar.b();
        if (strB == null) {
            strB = String.valueOf(cVar);
        }
        b(strB, cVar2);
        throw new md.i();
    }

    public static final Void b(String str, he.c<?> cVar) {
        String str2;
        ae.r.f(cVar, "baseClass");
        String str3 = "in the scope of '" + cVar.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + cVar.b() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new we.g(str2);
    }
}

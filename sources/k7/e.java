package k7;

import ae.r;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f14436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, j.d dVar) {
        super(dVar);
        r.f(iVar, "call");
        r.f(dVar, "result");
        this.f14436f = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e eVar, Context context) throws IOException {
        int i10;
        r.f(eVar, "this$0");
        r.f(context, "$context");
        Object obj = eVar.f14436f.f20504b;
        r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        r.d(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
        byte[] bArr = (byte[]) obj2;
        Object obj3 = list.get(1);
        r.d(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        r.d(obj4, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj4).intValue();
        Object obj5 = list.get(3);
        r.d(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        r.d(obj6, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue4 = ((Integer) obj6).intValue();
        Object obj7 = list.get(5);
        r.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj7).booleanValue();
        Object obj8 = list.get(6);
        r.d(obj8, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue5 = ((Integer) obj8).intValue();
        Object obj9 = list.get(7);
        r.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
        Object obj10 = list.get(8);
        r.d(obj10, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue6 = ((Integer) obj10).intValue();
        int iC = zBooleanValue ? l7.a.f14773a.c(bArr) : 0;
        if (iC == 90 || iC == 270) {
            i10 = iIntValue2;
        } else {
            i10 = iIntValue;
            iIntValue = iIntValue2;
        }
        o7.a aVarA = n7.a.f15934a.a(iIntValue5);
        if (aVarA == null) {
            r7.a.a("No support format.");
            eVar.c(null);
            return;
        }
        int i11 = iIntValue4 + iC;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                aVarA.a(context, bArr, byteArrayOutputStream, i10, iIntValue, iIntValue3, i11, zBooleanValue2, iIntValue6);
                eVar.c(byteArrayOutputStream.toByteArray());
            } catch (Exception e10) {
                if (j7.a.f14078c.a()) {
                    e10.printStackTrace();
                }
                eVar.c(null);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public final void f(final Context context) {
        r.f(context, "context");
        g.f14439c.a().execute(new Runnable() { // from class: k7.d
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                e.g(this.f14434a, context);
            }
        });
    }
}

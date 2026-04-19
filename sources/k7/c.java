package k7;

import ae.r;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f14433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, j.d dVar) {
        super(dVar);
        r.f(iVar, "call");
        r.f(dVar, "result");
        this.f14433f = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(c cVar, Context context) throws IOException {
        int i10;
        r.f(cVar, "this$0");
        r.f(context, "$context");
        Object obj = cVar.f14433f.f20504b;
        r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int iC = 0;
        Object obj2 = list.get(0);
        r.d(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
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
        Object obj11 = list.get(9);
        r.d(obj11, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue7 = ((Integer) obj11).intValue();
        o7.a aVarA = n7.a.f15934a.a(iIntValue5);
        if (aVarA == null) {
            r7.a.a("No support format.");
            cVar.c(null);
            return;
        }
        if (zBooleanValue) {
            iC = l7.a.f14773a.c(xd.i.c(new File(str)));
        }
        if (iC == 90 || iC == 270) {
            i10 = iIntValue;
        } else {
            i10 = iIntValue2;
            iIntValue2 = iIntValue;
        }
        int i11 = iIntValue4 + iC;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                aVarA.b(context, str, byteArrayOutputStream, iIntValue2, i10, iIntValue3, i11, zBooleanValue2, iIntValue6, iIntValue7);
                cVar.c(byteArrayOutputStream.toByteArray());
            } catch (Exception e10) {
                if (j7.a.f14078c.a()) {
                    e10.printStackTrace();
                }
                cVar.c(null);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x011b: MOVE (r14 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:34:0x011b */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(k7.c r17, android.content.Context r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c.j(k7.c, android.content.Context):void");
    }

    public final void g(final Context context) {
        r.f(context, "context");
        g.f14439c.a().execute(new Runnable() { // from class: k7.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                c.h(this.f14429a, context);
            }
        });
    }

    public final void i(final Context context) {
        r.f(context, "context");
        g.f14439c.a().execute(new Runnable() { // from class: k7.b
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                c.j(this.f14431a, context);
            }
        });
    }
}

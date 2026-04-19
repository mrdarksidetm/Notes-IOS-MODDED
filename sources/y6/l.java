package y6;

import ae.r;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.y;
import le.a2;
import le.d1;
import le.n0;
import le.o0;
import md.i0;
import nd.l0;
import nd.u;
import nd.v;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f23440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<c> f23441b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a2 f23442c;

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.SaveKt$processMultipleSaveFile$1", f = "Save.kt", l = {290}, m = "invokeSuspend")
    static final class a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f23444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Intent f23447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f23448f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Intent intent, Activity activity, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f23446d = i10;
            this.f23447e = intent;
            this.f23448f = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f23446d, this.f23447e, this.f23448f, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.SaveKt$processSingleSaveFile$1", f = "Save.kt", l = {223}, m = "invokeSuspend")
    static final class b extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f23450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Intent f23453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f23454f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Intent intent, Activity activity, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f23452d = i10;
            this.f23453e = intent;
            this.f23454f = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f23452d, this.f23453e, this.f23454f, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final a2 c() {
        return f23442c;
    }

    public static final boolean d(int i10, Intent intent, Activity activity) {
        r.f(activity, "context");
        f23442c = le.k.d(o0.a(d1.b()), null, null, new a(i10, intent, activity, null), 3, null);
        return true;
    }

    public static final boolean e(int i10, Intent intent, Activity activity) {
        r.f(activity, "context");
        le.k.d(o0.a(d1.c()), null, null, new b(i10, intent, activity, null), 3, null);
        return true;
    }

    public static final void f(List<k> list, List<String> list2, boolean z10, Activity activity) throws IOException {
        boolean zAdd;
        String str;
        r.f(list, "saveFilesInfo");
        r.f(activity, "context");
        m mVar = new m();
        long jNanoTime = System.nanoTime();
        ge.i iVarN = u.n(list);
        ArrayList arrayList = new ArrayList(v.x(iVarN, 10));
        Iterator<Integer> it = iVarN.iterator();
        while (it.hasNext()) {
            k kVar = list.get(((l0) it).nextInt());
            if (kVar.c() != null) {
                File file = new File(kVar.c());
                if (!file.exists()) {
                    Log.d("PickOrSavePlugin", "saveFile_not_found " + kVar.c());
                }
                String name = file.getName();
                if (name == null) {
                    str = "Unknown.ext";
                } else {
                    r.c(name);
                    str = name;
                }
                String str2 = com.amazon.a.a.o.c.a.b.f7490a + mVar.n(str);
                zAdd = f23441b.add(new c(file, str, y.Y0(str, str2.length()), str2, false));
            } else {
                String strB = kVar.b();
                String str3 = strB == null ? "Unknown.ext" : strB;
                String str4 = com.amazon.a.a.o.c.a.b.f7490a + mVar.n(str3);
                String strY0 = y.Y0(str3, str4.length());
                File fileCreateTempFile = File.createTempFile(strY0, str4);
                r.e(fileCreateTempFile, "createTempFile(...)");
                byte[] bArrA = kVar.a();
                r.c(bArrA);
                xd.i.f(fileCreateTempFile, bArrA);
                zAdd = f23441b.add(new c(fileCreateTempFile, str3, strY0, str4, false));
            }
            arrayList.add(Boolean.valueOf(zAdd));
        }
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (z10) {
            intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        }
        mVar.c(list2, intent);
        activity.startActivityForResult(intent, mVar.r());
        Log.d("PickOrSavePlugin", "saveFile - OUT");
        System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
    }

    public static final void g(k kVar, List<String> list, boolean z10, Activity activity) throws IOException {
        String strY0;
        File file;
        r.f(kVar, "saveFileInfo");
        r.f(activity, "context");
        m mVar = new m();
        long jNanoTime = System.nanoTime();
        if (kVar.c() != null) {
            file = new File(kVar.c());
            if (!file.exists()) {
                mVar.m("saveFile_not_found", "Save file is missing", kVar.c(), h.e());
                return;
            }
            String strB = kVar.b();
            if (strB == null) {
                strB = file.getName();
            }
            String str = strB == null ? "Unknown.ext" : strB;
            String str2 = com.amazon.a.a.o.c.a.b.f7490a + mVar.n(str);
            strY0 = y.Y0(str, str2.length());
            f23440a = new c(file, str, strY0, str2, false);
        } else {
            String strB2 = kVar.b();
            String str3 = strB2 == null ? "Unknown.ext" : strB2;
            String str4 = com.amazon.a.a.o.c.a.b.f7490a + mVar.n(str3);
            String strY02 = y.Y0(str3, str4.length());
            File fileCreateTempFile = File.createTempFile(strY02, str4);
            r.e(fileCreateTempFile, "createTempFile(...)");
            byte[] bArrA = kVar.a();
            r.c(bArrA);
            xd.i.f(fileCreateTempFile, bArrA);
            f23440a = new c(fileCreateTempFile, str3, strY02, str4, false);
            strY0 = strY02;
            file = fileCreateTempFile;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.putExtra("android.intent.extra.TITLE", strY0);
        if (z10) {
            intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(xd.k.i(file));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "*/*";
        }
        intent.setType(mimeTypeFromExtension);
        mVar.c(list, intent);
        activity.startActivityForResult(intent, mVar.p());
        Log.d("PickOrSavePlugin", "saveFile - OUT");
        System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
    }
}

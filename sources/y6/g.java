package y6;

import ae.r;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.UriPermission;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import je.w;
import le.d1;
import le.n0;
import le.o0;
import md.i0;
import md.u;
import nd.c0;
import sc.j;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class g implements sc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f23417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f23418b;

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.PickOrSave$cacheFilePath$1", f = "PickOrSave.kt", l = {336}, m = "invokeSuspend")
    static final class a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j.d f23421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f23422d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, j.d dVar, g gVar, qd.d<? super a> dVar2) {
            super(2, dVar2);
            this.f23420b = str;
            this.f23421c = dVar;
            this.f23422d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f23420b, this.f23421c, this.f23422d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            m mVar;
            String strB;
            j.d dVarA;
            String str;
            Object objE = rd.d.e();
            int i10 = this.f23419a;
            try {
                if (i10 == 0) {
                    u.b(obj);
                    Log.d("PickOrSave", "cacheFileFromUri - IN, sourceFilePathOrUri=" + this.f23420b);
                    h.f(this.f23421c);
                    String str2 = this.f23420b;
                    r.c(str2);
                    Activity activity = this.f23422d.f23417a;
                    j.d dVarA2 = h.a();
                    this.f23419a = 1;
                    obj = y6.a.a(str2, activity, dVarA2, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                this.f23422d.f23418b.k((String) obj, h.a());
                Log.d("PickOrSave", "cacheFileFromUri - OUT");
            } catch (Error e10) {
                mVar = this.f23422d.f23418b;
                strB = md.f.b(e10);
                dVarA = h.a();
                str = "cacheFileFromUri_error";
                mVar.m(str, strB, null, dVarA);
            } catch (Exception e11) {
                mVar = this.f23422d.f23418b;
                strB = md.f.b(e11);
                dVarA = h.a();
                str = "cacheFileFromUri_exception";
                mVar.m(str, strB, null, dVarA);
            }
            return i0.f15558a;
        }
    }

    public g(Activity activity) {
        r.f(activity, "activity");
        this.f23417a = activity;
        this.f23418b = new m();
    }

    public final void c(j.d dVar, String str) {
        r.f(dVar, "resultCallback");
        le.k.d(o0.a(d1.c()), null, null, new a(str, dVar, this, null), 3, null);
    }

    public final void d(b bVar) {
        Log.d("PickOrSave", "cancelActions - IN, cancelType=" + bVar);
        if (bVar == b.f23367a) {
            this.f23418b.e();
        } else if (bVar == b.f23368b) {
            this.f23418b.d();
        }
    }

    public final void e(j.d dVar, String str) {
        m mVar;
        String strB;
        j.d dVarC;
        String str2;
        r.f(dVar, "resultCallback");
        try {
            Log.d("PickOrSave", "fileMetaData - IN, sourceFilePathOrUri=" + str);
            h.h(dVar);
            j.d dVarC2 = h.c();
            r.c(str);
            d.a(dVarC2, str, this.f23417a);
            Log.d("PickOrSave", "fileMetaData - OUT");
        } catch (Error e10) {
            mVar = this.f23418b;
            strB = md.f.b(e10);
            dVarC = h.c();
            str2 = "pickFile_error";
            mVar.m(str2, strB, null, dVarC);
        } catch (Exception e11) {
            mVar = this.f23418b;
            strB = md.f.b(e11);
            dVarC = h.c();
            str2 = "pickFile_exception";
            mVar.m(str2, strB, null, dVarC);
        }
    }

    public final void f(j.d dVar, String str) {
        m mVar;
        String strB;
        j.d dVarD;
        String str2;
        r.f(dVar, "resultCallback");
        try {
            Log.d("PickOrSave", "pickFile - IN, initialDirectoryUri=" + str);
            if (h.d() != null) {
                this.f23418b.l(dVar);
            } else if (h.e() != null) {
                this.f23418b.l(dVar);
            } else {
                h.i(dVar);
                f.f(str, this.f23417a);
            }
        } catch (Error e10) {
            mVar = this.f23418b;
            strB = md.f.b(e10);
            dVarD = h.d();
            str2 = "pickDirectory_error";
            mVar.m(str2, strB, null, dVarD);
        } catch (Exception e11) {
            mVar = this.f23418b;
            strB = md.f.b(e11);
            dVarD = h.d();
            str2 = "pickDirectory_exception";
            mVar.m(str2, strB, null, dVarD);
        }
    }

    public final void g(j.d dVar, String str, String str2, Boolean bool, List<String> list, List<String> list2) {
        m mVar;
        String strB;
        j.d dVarB;
        String str3;
        r.f(dVar, "resultCallback");
        r.f(list, "allowedExtensions");
        r.f(list2, "mimeTypesFilter");
        try {
            Log.d("PickOrSave", "pickFile - IN, documentId=" + str + ", directoryUri=" + str2 + ", recurseDirectories=" + bool + ", allowedExtensions=" + list + ", mimeTypesFilter=" + list2);
            h.g(dVar);
            r.c(str2);
            r.c(bool);
            f.d(str, str2, bool.booleanValue(), list, list2, this.f23417a);
        } catch (Error e10) {
            mVar = this.f23418b;
            strB = md.f.b(e10);
            dVarB = h.b();
            str3 = "pickDirectoryDocuments_error";
            mVar.m(str3, strB, null, dVarB);
        } catch (Exception e11) {
            mVar = this.f23418b;
            strB = md.f.b(e11);
            dVarB = h.b();
            str3 = "pickDirectoryDocuments_exception";
            mVar.m(str3, strB, null, dVarB);
        }
    }

    public final void h(j.d dVar, List<String> list, List<String> list2, boolean z10, boolean z11, j jVar, boolean z12) {
        m mVar;
        String strB;
        j.d dVarD;
        String str;
        r.f(dVar, "resultCallback");
        r.f(list, "allowedExtensions");
        r.f(list2, "mimeTypesFilter");
        r.f(jVar, "pickerType");
        try {
            Log.d("PickOrSave", "pickFile - IN, allowedExtensions=" + list + ", mimeTypesFilter=" + list2 + ", localOnly=" + z10 + ", copyFileToCacheDir=" + z11 + ", pickerType=" + jVar + ", enableMultipleSelection=" + z12);
            if (h.d() != null) {
                this.f23418b.l(dVar);
                return;
            }
            if (h.e() != null) {
                this.f23418b.l(dVar);
                return;
            }
            h.i(dVar);
            if (jVar == j.f23433a) {
                if (z12) {
                    f.e(list, list2, z10, z11, this.f23417a);
                    return;
                } else {
                    f.g(list, list2, z10, z11, this.f23417a);
                    return;
                }
            }
            if (jVar == j.f23434b) {
                if (this.f23418b.t()) {
                    f.h(list, w.W0((String) c0.Y(list2)).toString(), z11, z12, this.f23417a);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (i10 == 0 && r.b(w.W0(list2.get(i10)).toString(), "*/*")) {
                        arrayList.addAll(nd.u.p("image/*", "video/*"));
                    } else {
                        arrayList.add(list2.get(i10));
                    }
                }
                if (z12) {
                    f.e(list, arrayList, z10, z11, this.f23417a);
                } else {
                    f.g(list, arrayList, z10, z11, this.f23417a);
                }
            }
        } catch (Error e10) {
            mVar = this.f23418b;
            strB = md.f.b(e10);
            dVarD = h.d();
            str = "pickFile_error";
            mVar.m(str, strB, null, dVarD);
        } catch (Exception e11) {
            mVar = this.f23418b;
            strB = md.f.b(e11);
            dVarD = h.d();
            str = "pickFile_exception";
            mVar.m(str, strB, null, dVarD);
        }
    }

    public final void i(j.d dVar, List<k> list, List<String> list2, boolean z10) {
        m mVar;
        String strB;
        j.d dVarD;
        String str;
        r.f(dVar, "resultCallback");
        try {
            Log.d("PickOrSave", "saveFile - IN, saveFiles=" + list + ", mimeTypesFilter=" + list2 + ", localOnly=" + z10);
            if (h.d() != null) {
                this.f23418b.l(dVar);
                return;
            }
            if (h.e() != null) {
                this.f23418b.l(dVar);
                return;
            }
            h.j(dVar);
            if (list == null) {
                this.f23418b.m("saveFiles_not_found", "Save files list is null", "Save files list is null", h.d());
                return;
            }
            if (list.isEmpty()) {
                this.f23418b.m("saveFiles_not_found", "Save files list is empty", "Save files list is empty", h.d());
            } else if (list.size() == 1) {
                l.g((k) c0.Y(list), list2, z10, this.f23417a);
            } else {
                l.f(list, list2, z10, this.f23417a);
            }
        } catch (Error e10) {
            mVar = this.f23418b;
            strB = md.f.b(e10);
            dVarD = h.d();
            str = "saveFile_error";
            mVar.m(str, strB, null, dVarD);
        } catch (Exception e11) {
            mVar = this.f23418b;
            strB = md.f.b(e11);
            dVarD = h.d();
            str = "saveFile_exception";
            mVar.m(str, strB, null, dVarD);
        }
    }

    public final void j(j.d dVar, String str, Boolean bool) {
        r.f(dVar, "resultCallback");
        Log.d("PickOrSave", "uriPermissionStatus - IN, uri=" + str + ", releasePermission:" + bool);
        ContentResolver contentResolver = this.f23417a.getContentResolver();
        ArrayList arrayList = new ArrayList();
        List<UriPermission> persistedUriPermissions = contentResolver.getPersistedUriPermissions();
        r.e(persistedUriPermissions, "getPersistedUriPermissions(...)");
        int size = persistedUriPermissions.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = persistedUriPermissions.get(i10).getUri().toString();
            r.e(string, "toString(...)");
            if (persistedUriPermissions.get(i10).isWritePermission() && persistedUriPermissions.get(i10).isReadPermission()) {
                arrayList.add(string);
            }
        }
        r.c(bool);
        if (bool.booleanValue() && c0.S(arrayList, str)) {
            m mVar = this.f23418b;
            r.c(str);
            contentResolver.releasePersistableUriPermission(mVar.s(str), 3);
            arrayList.remove(str);
        }
        this.f23418b.k(Boolean.valueOf(c0.S(arrayList, str)), dVar);
        Log.d("PickOrSave", "uriPermissionStatus - OUT");
    }

    public final void k(j.d dVar) {
        r.f(dVar, "resultCallback");
        Log.d("PickOrSave", "urisWithPersistedPermission - IN");
        ContentResolver contentResolver = this.f23417a.getContentResolver();
        ArrayList arrayList = new ArrayList();
        List<UriPermission> persistedUriPermissions = contentResolver.getPersistedUriPermissions();
        r.e(persistedUriPermissions, "getPersistedUriPermissions(...)");
        int size = persistedUriPermissions.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = persistedUriPermissions.get(i10).getUri().toString();
            r.e(string, "toString(...)");
            if (persistedUriPermissions.get(i10).isWritePermission() && persistedUriPermissions.get(i10).isReadPermission()) {
                arrayList.add(string);
            }
        }
        this.f23418b.k(arrayList, dVar);
        Log.d("PickOrSave", "urisWithPersistedPermission - OUT");
    }

    @Override // sc.l
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == this.f23418b.q()) {
            return e.b(i11, intent, this.f23417a);
        }
        if (i10 == this.f23418b.p()) {
            return e.a(i11, intent, this.f23417a);
        }
        if (i10 == this.f23418b.r()) {
            return e.c(i11, intent, this.f23417a);
        }
        return false;
    }
}

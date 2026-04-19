package e7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PackageManager f10646a;

    static final class a extends ae.s implements zd.a<List<? extends c0>> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final List<? extends c0> invoke() {
            List<ApplicationInfo> installedApplications = e0.this.f10646a.getInstalledApplications(128);
            ae.r.e(installedApplications, "packageManager\n         …ageManager.GET_META_DATA)");
            ArrayList arrayList = new ArrayList(nd.v.x(installedApplications, 10));
            Iterator<T> it = installedApplications.iterator();
            while (it.hasNext()) {
                String str = ((ApplicationInfo) it.next()).packageName;
                ae.r.e(str, "it.packageName");
                arrayList.add(new c0(str));
            }
            return arrayList;
        }
    }

    static final class b extends ae.s implements zd.a<List<? extends c0>> {
        b() {
            super(0);
        }

        @Override // zd.a
        public final List<? extends c0> invoke() {
            List<ApplicationInfo> installedApplications = e0.this.f10646a.getInstalledApplications(128);
            ae.r.e(installedApplications, "packageManager\n         …ageManager.GET_META_DATA)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : installedApplications) {
                String str = ((ApplicationInfo) obj).sourceDir;
                ae.r.e(str, "it.sourceDir");
                if (je.w.L(str, "/system/", false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(nd.v.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = ((ApplicationInfo) it.next()).packageName;
                ae.r.e(str2, "it.packageName");
                arrayList2.add(new c0(str2));
            }
            return arrayList2;
        }
    }

    public e0(PackageManager packageManager) {
        ae.r.f(packageManager, "packageManager");
        this.f10646a = packageManager;
    }

    @Override // e7.d0
    public List<c0> a() {
        return (List) g7.a.a(new b(), nd.u.m());
    }

    @Override // e7.d0
    public List<c0> b() {
        return (List) g7.a.a(new a(), nd.u.m());
    }
}

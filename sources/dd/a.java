package dd;

import android.util.Log;
import dd.a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import sc.a;
import sc.p;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: dd.a$a, reason: collision with other inner class name */
    public static class C0231a extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10038b;
    }

    public interface b {
        static sc.h<Object> a() {
            return c.f10039d;
        }

        static void b(sc.b bVar, String str, final b bVar2) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath" + str2, a(), bVar.c());
            if (bVar2 != null) {
                aVar.e(new a.d() { // from class: dd.b
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.b.q(this.f10053a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath" + str2, a(), bVar.c());
            if (bVar2 != null) {
                aVar2.e(new a.d() { // from class: dd.c
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.b.h(this.f10054a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath" + str2, a(), bVar.c());
            if (bVar2 != null) {
                aVar3.e(new a.d() { // from class: dd.d
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.b.j(this.f10055a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath" + str2, a(), bVar.c());
            if (bVar2 != null) {
                aVar4.e(new a.d() { // from class: dd.e
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.b.c(this.f10056a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath" + str2, a(), bVar.c());
            if (bVar2 != null) {
                aVar5.e(new a.d() { // from class: dd.f
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.b.f(this.f10057a, obj, eVar);
                    }
                });
            } else {
                aVar5.e(null);
            }
            sc.a aVar6 = new sc.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths" + str2, a(), bVar.c());
            if (bVar2 != null) {
                aVar6.e(new a.d() { // from class: dd.g
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.b.t(this.f10058a, obj, eVar);
                    }
                });
            } else {
                aVar6.e(null);
            }
            sc.a aVar7 = new sc.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths" + str2, a(), bVar.c());
            if (bVar2 != null) {
                aVar7.e(new a.d() { // from class: dd.h
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a.b.x(this.f10059a, obj, eVar);
                    }
                });
            } else {
                aVar7.e(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void c(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.l());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void f(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.i());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void h(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.p());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void j(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.m());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void q(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.k());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        static void r(sc.b bVar, b bVar2) {
            b(bVar, "", bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void t(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.d());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void x(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.v((d) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        List<String> d();

        String i();

        String k();

        String l();

        String m();

        String p();

        List<String> v(d dVar);
    }

    private static class c extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f10039d = new c();

        private c() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            if (b10 != -127) {
                return super.g(b10, byteBuffer);
            }
            Object objF = f(byteBuffer);
            if (objF == null) {
                return null;
            }
            return d.values()[((Long) objF).intValue()];
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof d)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((d) obj).f10052a));
            }
        }
    }

    public enum d {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10052a;

        d(int i10) {
            this.f10052a = i10;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0231a) {
            C0231a c0231a = (C0231a) th;
            arrayList.add(c0231a.f10037a);
            arrayList.add(c0231a.getMessage());
            obj = c0231a.f10038b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}

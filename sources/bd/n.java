package bd;

import android.util.Log;
import bd.n;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import sc.a;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    public static class a extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f5746b;

        public a(String str, String str2, Object obj) {
            super(str2);
            this.f5745a = str;
            this.f5746b = obj;
        }
    }

    public interface b {

        class a implements e<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f5747a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f5748b;

            a(ArrayList arrayList, a.e eVar) {
                this.f5747a = arrayList;
                this.f5748b = eVar;
            }

            @Override // bd.n.e
            public void a(Throwable th) {
                this.f5748b.a(n.a(th));
            }

            @Override // bd.n.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(g gVar) {
                this.f5747a.add(0, gVar);
                this.f5748b.a(this.f5747a);
            }
        }

        /* JADX INFO: renamed from: bd.n$b$b, reason: collision with other inner class name */
        class C0137b implements e<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f5749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f5750b;

            C0137b(ArrayList arrayList, a.e eVar) {
                this.f5749a = arrayList;
                this.f5750b = eVar;
            }

            @Override // bd.n.e
            public void a(Throwable th) {
                this.f5750b.a(n.a(th));
            }

            @Override // bd.n.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(g gVar) {
                this.f5749a.add(0, gVar);
                this.f5750b.a(this.f5749a);
            }
        }

        class c implements e<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f5751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f5752b;

            c(ArrayList arrayList, a.e eVar) {
                this.f5751a = arrayList;
                this.f5752b = eVar;
            }

            @Override // bd.n.e
            public void a(Throwable th) {
                this.f5752b.a(n.a(th));
            }

            @Override // bd.n.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f5751a.add(0, str);
                this.f5752b.a(this.f5751a);
            }
        }

        class d implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f5753a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f5754b;

            d(ArrayList arrayList, a.e eVar) {
                this.f5753a = arrayList;
                this.f5754b = eVar;
            }

            @Override // bd.n.h
            public void a(Throwable th) {
                this.f5754b.a(n.a(th));
            }

            @Override // bd.n.h
            public void b() {
                this.f5753a.add(0, null);
                this.f5754b.a(this.f5753a);
            }
        }

        class e implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f5755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f5756b;

            e(ArrayList arrayList, a.e eVar) {
                this.f5755a = arrayList;
                this.f5756b = eVar;
            }

            @Override // bd.n.h
            public void a(Throwable th) {
                this.f5756b.a(n.a(th));
            }

            @Override // bd.n.h
            public void b() {
                this.f5755a.add(0, null);
                this.f5756b.a(this.f5755a);
            }
        }

        class f implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f5757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f5758b;

            f(ArrayList arrayList, a.e eVar) {
                this.f5757a = arrayList;
                this.f5758b = eVar;
            }

            @Override // bd.n.h
            public void a(Throwable th) {
                this.f5758b.a(n.a(th));
            }

            @Override // bd.n.h
            public void b() {
                this.f5757a.add(0, null);
                this.f5758b.a(this.f5757a);
            }
        }

        class g implements e<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f5759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f5760b;

            g(ArrayList arrayList, a.e eVar) {
                this.f5759a = arrayList;
                this.f5760b = eVar;
            }

            @Override // bd.n.e
            public void a(Throwable th) {
                this.f5760b.a(n.a(th));
            }

            @Override // bd.n.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(Boolean bool) {
                this.f5759a.add(0, bool);
                this.f5760b.a(this.f5759a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void B(b bVar, Object obj, a.e eVar) {
            bVar.A(new C0137b(new ArrayList(), eVar));
        }

        static sc.h<Object> a() {
            return d.f5767d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void b(b bVar, Object obj, a.e eVar) {
            bVar.d((List) ((ArrayList) obj).get(0), new g(new ArrayList(), eVar));
        }

        static void f(sc.b bVar, b bVar2) {
            k(bVar, "", bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void g(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                bVar.l((c) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
            eVar.a(arrayList);
        }

        static void k(sc.b bVar, String str, final b bVar2) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init" + str2, a());
            if (bVar2 != null) {
                aVar.e(new a.d() { // from class: bd.o
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.g(this.f5784a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently" + str2, a());
            if (bVar2 != null) {
                aVar2.e(new a.d() { // from class: bd.p
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.y(this.f5785a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn" + str2, a());
            if (bVar2 != null) {
                aVar3.e(new a.d() { // from class: bd.q
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.B(this.f5786a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken" + str2, a());
            if (bVar2 != null) {
                aVar4.e(new a.d() { // from class: bd.r
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.s(this.f5787a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut" + str2, a());
            if (bVar2 != null) {
                aVar5.e(new a.d() { // from class: bd.s
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.u(this.f5788a, obj, eVar);
                    }
                });
            } else {
                aVar5.e(null);
            }
            sc.a aVar6 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect" + str2, a());
            if (bVar2 != null) {
                aVar6.e(new a.d() { // from class: bd.t
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.m(this.f5789a, obj, eVar);
                    }
                });
            } else {
                aVar6.e(null);
            }
            sc.a aVar7 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn" + str2, a());
            if (bVar2 != null) {
                aVar7.e(new a.d() { // from class: bd.u
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.q(this.f5790a, obj, eVar);
                    }
                });
            } else {
                aVar7.e(null);
            }
            sc.a aVar8 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache" + str2, a());
            if (bVar2 != null) {
                aVar8.e(new a.d() { // from class: bd.v
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.n(this.f5791a, obj, eVar);
                    }
                });
            } else {
                aVar8.e(null);
            }
            sc.a aVar9 = new sc.a(bVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes" + str2, a());
            if (bVar2 != null) {
                aVar9.e(new a.d() { // from class: bd.w
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        n.b.b(this.f5792a, obj, eVar);
                    }
                });
            } else {
                aVar9.e(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void m(b bVar, Object obj, a.e eVar) {
            bVar.c(new e(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void n(b bVar, Object obj, a.e eVar) {
            bVar.o((String) ((ArrayList) obj).get(0), new f(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void q(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.p());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void s(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            bVar.v((String) arrayList.get(0), (Boolean) arrayList.get(1), new c(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void u(b bVar, Object obj, a.e eVar) {
            bVar.e(new d(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void y(b bVar, Object obj, a.e eVar) {
            bVar.h(new a(new ArrayList(), eVar));
        }

        void A(e<g> eVar);

        void c(h hVar);

        void d(List<String> list, e<Boolean> eVar);

        void e(h hVar);

        void h(e<g> eVar);

        void l(c cVar);

        void o(String str, h hVar);

        Boolean p();

        void v(String str, Boolean bool, e<String> eVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f5761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f5762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f5764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f5765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f5766f;

        c() {
        }

        static c a(ArrayList<Object> arrayList) {
            c cVar = new c();
            cVar.k((List) arrayList.get(0));
            cVar.m((f) arrayList.get(1));
            cVar.j((String) arrayList.get(2));
            cVar.h((String) arrayList.get(3));
            cVar.l((String) arrayList.get(4));
            cVar.i((Boolean) arrayList.get(5));
            return cVar;
        }

        public String b() {
            return this.f5764d;
        }

        public Boolean c() {
            return this.f5766f;
        }

        public String d() {
            return this.f5763c;
        }

        public List<String> e() {
            return this.f5761a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5761a.equals(cVar.f5761a) && this.f5762b.equals(cVar.f5762b) && Objects.equals(this.f5763c, cVar.f5763c) && Objects.equals(this.f5764d, cVar.f5764d) && Objects.equals(this.f5765e, cVar.f5765e) && this.f5766f.equals(cVar.f5766f);
        }

        public String f() {
            return this.f5765e;
        }

        public f g() {
            return this.f5762b;
        }

        public void h(String str) {
            this.f5764d = str;
        }

        public int hashCode() {
            return Objects.hash(this.f5761a, this.f5762b, this.f5763c, this.f5764d, this.f5765e, this.f5766f);
        }

        public void i(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
            }
            this.f5766f = bool;
        }

        public void j(String str) {
            this.f5763c = str;
        }

        public void k(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"scopes\" is null.");
            }
            this.f5761a = list;
        }

        public void l(String str) {
            this.f5765e = str;
        }

        public void m(f fVar) {
            if (fVar == null) {
                throw new IllegalStateException("Nonnull field \"signInType\" is null.");
            }
            this.f5762b = fVar;
        }

        ArrayList<Object> n() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.f5761a);
            arrayList.add(this.f5762b);
            arrayList.add(this.f5763c);
            arrayList.add(this.f5764d);
            arrayList.add(this.f5765e);
            arrayList.add(this.f5766f);
            return arrayList;
        }
    }

    private static class d extends sc.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f5767d = new d();

        private d() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case -127:
                    Object objF = f(byteBuffer);
                    if (objF == null) {
                        return null;
                    }
                    return f.values()[((Long) objF).intValue()];
                case -126:
                    return c.a((ArrayList) f(byteBuffer));
                case -125:
                    return g.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Object objH;
            if (obj instanceof f) {
                byteArrayOutputStream.write(129);
                objH = obj == null ? null : Integer.valueOf(((f) obj).f5771a);
            } else if (obj instanceof c) {
                byteArrayOutputStream.write(130);
                objH = ((c) obj).n();
            } else if (!(obj instanceof g)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(131);
                objH = ((g) obj).h();
            }
            p(byteArrayOutputStream, objH);
        }
    }

    public interface e<T> {
        void a(Throwable th);

        void success(T t10);
    }

    public enum f {
        STANDARD(0),
        GAMES(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f5771a;

        f(int i10) {
            this.f5771a = i10;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f5775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f5776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f5777f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f5778a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f5779b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f5780c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f5781d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f5782e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f5783f;

            public g a() {
                g gVar = new g();
                gVar.b(this.f5778a);
                gVar.c(this.f5779b);
                gVar.d(this.f5780c);
                gVar.f(this.f5781d);
                gVar.e(this.f5782e);
                gVar.g(this.f5783f);
                return gVar;
            }

            public a b(String str) {
                this.f5778a = str;
                return this;
            }

            public a c(String str) {
                this.f5779b = str;
                return this;
            }

            public a d(String str) {
                this.f5780c = str;
                return this;
            }

            public a e(String str) {
                this.f5782e = str;
                return this;
            }

            public a f(String str) {
                this.f5781d = str;
                return this;
            }

            public a g(String str) {
                this.f5783f = str;
                return this;
            }
        }

        g() {
        }

        static g a(ArrayList<Object> arrayList) {
            g gVar = new g();
            gVar.b((String) arrayList.get(0));
            gVar.c((String) arrayList.get(1));
            gVar.d((String) arrayList.get(2));
            gVar.f((String) arrayList.get(3));
            gVar.e((String) arrayList.get(4));
            gVar.g((String) arrayList.get(5));
            return gVar;
        }

        public void b(String str) {
            this.f5772a = str;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"email\" is null.");
            }
            this.f5773b = str;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f5774c = str;
        }

        public void e(String str) {
            this.f5776e = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f5772a, gVar.f5772a) && this.f5773b.equals(gVar.f5773b) && this.f5774c.equals(gVar.f5774c) && Objects.equals(this.f5775d, gVar.f5775d) && Objects.equals(this.f5776e, gVar.f5776e) && Objects.equals(this.f5777f, gVar.f5777f);
        }

        public void f(String str) {
            this.f5775d = str;
        }

        public void g(String str) {
            this.f5777f = str;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.f5772a);
            arrayList.add(this.f5773b);
            arrayList.add(this.f5774c);
            arrayList.add(this.f5775d);
            arrayList.add(this.f5776e);
            arrayList.add(this.f5777f);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f5772a, this.f5773b, this.f5774c, this.f5775d, this.f5776e, this.f5777f);
        }
    }

    public interface h {
        void a(Throwable th);

        void b();
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof a) {
            a aVar = (a) th;
            arrayList.add(aVar.f5745a);
            arrayList.add(aVar.getMessage());
            obj = aVar.f5746b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}

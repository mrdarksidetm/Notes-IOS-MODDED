package yc;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sc.a;
import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class a1 {

    public enum a {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23604a;

        a(int i10) {
            this.f23604a = i10;
        }
    }

    public static final class a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b0 f23605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r f23606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s f23607c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private b0 f23608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private r f23609b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private s f23610c;

            public a0 a() {
                a0 a0Var = new a0();
                a0Var.d(this.f23608a);
                a0Var.b(this.f23609b);
                a0Var.c(this.f23610c);
                return a0Var;
            }

            public a b(r rVar) {
                this.f23609b = rVar;
                return this;
            }

            public a c(s sVar) {
                this.f23610c = sVar;
                return this;
            }

            public a d(b0 b0Var) {
                this.f23608a = b0Var;
                return this;
            }
        }

        static a0 a(ArrayList<Object> arrayList) {
            a0 a0Var = new a0();
            a0Var.d((b0) arrayList.get(0));
            a0Var.b((r) arrayList.get(1));
            a0Var.c((s) arrayList.get(2));
            return a0Var;
        }

        public void b(r rVar) {
            this.f23606b = rVar;
        }

        public void c(s sVar) {
            this.f23607c = sVar;
        }

        public void d(b0 b0Var) {
            this.f23605a = b0Var;
        }

        ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f23605a);
            arrayList.add(this.f23606b);
            arrayList.add(this.f23607c);
            return arrayList;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23613c;

        b() {
        }

        static b a(ArrayList<Object> arrayList) {
            b bVar = new b();
            bVar.e((String) arrayList.get(0));
            bVar.g((String) arrayList.get(1));
            bVar.f((String) arrayList.get(2));
            return bVar;
        }

        public String b() {
            return this.f23611a;
        }

        public String c() {
            return this.f23613c;
        }

        public String d() {
            return this.f23612b;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.f23611a = str;
        }

        public void f(String str) {
            this.f23613c = str;
        }

        public void g(String str) {
            this.f23612b = str;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f23611a);
            arrayList.add(this.f23612b);
            arrayList.add(this.f23613c);
            return arrayList;
        }
    }

    public static final class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c0 f23614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Map<Object, Object>> f23615b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private c0 f23616a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<Map<Object, Object>> f23617b;

            public b0 a() {
                b0 b0Var = new b0();
                b0Var.e(this.f23616a);
                b0Var.d(this.f23617b);
                return b0Var;
            }

            public a b(List<Map<Object, Object>> list) {
                this.f23617b = list;
                return this;
            }

            public a c(c0 c0Var) {
                this.f23616a = c0Var;
                return this;
            }
        }

        b0() {
        }

        static b0 a(ArrayList<Object> arrayList) {
            b0 b0Var = new b0();
            b0Var.e((c0) arrayList.get(0));
            b0Var.d((List) arrayList.get(1));
            return b0Var;
        }

        public List<Map<Object, Object>> b() {
            return this.f23615b;
        }

        public c0 c() {
            return this.f23614a;
        }

        public void d(List<Map<Object, Object>> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"providerData\" is null.");
            }
            this.f23615b = list;
        }

        public void e(c0 c0Var) {
            if (c0Var == null) {
                throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
            }
            this.f23614a = c0Var;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f23614a);
            arrayList.add(this.f23615b);
            return arrayList;
        }
    }

    public interface c {

        class a implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23618a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23619b;

            a(ArrayList arrayList, a.e eVar) {
                this.f23618a = arrayList;
                this.f23619b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23619b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23618a.add(0, a0Var);
                this.f23619b.a(this.f23618a);
            }
        }

        class b implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23621b;

            b(ArrayList arrayList, a.e eVar) {
                this.f23620a = arrayList;
                this.f23621b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23621b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23620a.add(0, a0Var);
                this.f23621b.a(this.f23620a);
            }
        }

        /* JADX INFO: renamed from: yc.a1$c$c, reason: collision with other inner class name */
        class C0488c implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23622a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23623b;

            C0488c(ArrayList arrayList, a.e eVar) {
                this.f23622a = arrayList;
                this.f23623b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23623b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23622a.add(0, a0Var);
                this.f23623b.a(this.f23622a);
            }
        }

        class d implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23624a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23625b;

            d(ArrayList arrayList, a.e eVar) {
                this.f23624a = arrayList;
                this.f23625b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23625b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23624a.add(0, a0Var);
                this.f23625b.a(this.f23624a);
            }
        }

        class e implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23627b;

            e(ArrayList arrayList, a.e eVar) {
                this.f23626a = arrayList;
                this.f23627b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23627b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23626a.add(0, null);
                this.f23627b.a(this.f23626a);
            }
        }

        class f implements f0<List<String>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23629b;

            f(ArrayList arrayList, a.e eVar) {
                this.f23628a = arrayList;
                this.f23629b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23629b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(List<String> list) {
                this.f23628a.add(0, list);
                this.f23629b.a(this.f23628a);
            }
        }

        class g implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23631b;

            g(ArrayList arrayList, a.e eVar) {
                this.f23630a = arrayList;
                this.f23631b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23631b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23630a.add(0, null);
                this.f23631b.a(this.f23630a);
            }
        }

        class h implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23633b;

            h(ArrayList arrayList, a.e eVar) {
                this.f23632a = arrayList;
                this.f23633b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23633b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23632a.add(0, null);
                this.f23633b.a(this.f23632a);
            }
        }

        class i implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23634a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23635b;

            i(ArrayList arrayList, a.e eVar) {
                this.f23634a = arrayList;
                this.f23635b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23635b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23634a.add(0, str);
                this.f23635b.a(this.f23634a);
            }
        }

        class j implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23637b;

            j(ArrayList arrayList, a.e eVar) {
                this.f23636a = arrayList;
                this.f23637b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23637b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23636a.add(0, null);
                this.f23637b.a(this.f23636a);
            }
        }

        class k implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23638a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23639b;

            k(ArrayList arrayList, a.e eVar) {
                this.f23638a = arrayList;
                this.f23639b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23639b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23638a.add(0, str);
                this.f23639b.a(this.f23638a);
            }
        }

        class l implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23640a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23641b;

            l(ArrayList arrayList, a.e eVar) {
                this.f23640a = arrayList;
                this.f23641b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23641b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23640a.add(0, str);
                this.f23641b.a(this.f23640a);
            }
        }

        class m implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23643b;

            m(ArrayList arrayList, a.e eVar) {
                this.f23642a = arrayList;
                this.f23643b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23643b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23642a.add(0, str);
                this.f23643b.a(this.f23642a);
            }
        }

        class n implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23645b;

            n(ArrayList arrayList, a.e eVar) {
                this.f23644a = arrayList;
                this.f23645b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23645b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23644a.add(0, null);
                this.f23645b.a(this.f23644a);
            }
        }

        class o implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23646a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23647b;

            o(ArrayList arrayList, a.e eVar) {
                this.f23646a = arrayList;
                this.f23647b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23647b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23646a.add(0, str);
                this.f23647b.a(this.f23646a);
            }
        }

        class p implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23649b;

            p(ArrayList arrayList, a.e eVar) {
                this.f23648a = arrayList;
                this.f23649b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23649b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23648a.add(0, null);
                this.f23649b.a(this.f23648a);
            }
        }

        class q implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23650a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23651b;

            q(ArrayList arrayList, a.e eVar) {
                this.f23650a = arrayList;
                this.f23651b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23651b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23650a.add(0, null);
                this.f23651b.a(this.f23650a);
            }
        }

        class r implements f0<o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23653b;

            r(ArrayList arrayList, a.e eVar) {
                this.f23652a = arrayList;
                this.f23653b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23653b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(o oVar) {
                this.f23652a.add(0, oVar);
                this.f23653b.a(this.f23652a);
            }
        }

        class s implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23654a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23655b;

            s(ArrayList arrayList, a.e eVar) {
                this.f23654a = arrayList;
                this.f23655b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23655b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23654a.add(0, null);
                this.f23655b.a(this.f23654a);
            }
        }

        class t implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23656a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23657b;

            t(ArrayList arrayList, a.e eVar) {
                this.f23656a = arrayList;
                this.f23657b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23657b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23656a.add(0, a0Var);
                this.f23657b.a(this.f23656a);
            }
        }

        class u implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23659b;

            u(ArrayList arrayList, a.e eVar) {
                this.f23658a = arrayList;
                this.f23659b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23659b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23658a.add(0, a0Var);
                this.f23659b.a(this.f23658a);
            }
        }

        class v implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23661b;

            v(ArrayList arrayList, a.e eVar) {
                this.f23660a = arrayList;
                this.f23661b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23661b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23660a.add(0, a0Var);
                this.f23661b.a(this.f23660a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void A(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.l((b) arrayList.get(0), (String) arrayList.get(1), (q) arrayList.get(2), new g(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void G(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.U((b) arrayList.get(0), (e0) arrayList.get(1), new m(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void H(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.J((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new t(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void L(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.d((b) arrayList.get(0), (Map) arrayList.get(1), new v(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void O(c cVar, Object obj, a.e eVar) {
            cVar.i((b) ((ArrayList) obj).get(0), new u(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void P(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.f0((b) arrayList.get(0), (y) arrayList.get(1), new d(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void Q(c cVar, Object obj, a.e eVar) {
            cVar.X((b) ((ArrayList) obj).get(0), new e(new ArrayList(), eVar));
        }

        static void R(sc.b bVar, c cVar) {
            m0(bVar, "", cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void S(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.c((b) arrayList.get(0), (String) arrayList.get(1), new a(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void V(c cVar, Object obj, a.e eVar) {
            cVar.q((b) ((ArrayList) obj).get(0), new k(new ArrayList(), eVar));
        }

        static sc.h<Object> a() {
            return d.f23686d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void a0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.o((b) arrayList.get(0), (t) arrayList.get(1), new j(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void b(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.e0((b) arrayList.get(0), (String) arrayList.get(1), (q) arrayList.get(2), new h(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void c0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.r((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new b(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void d0(c cVar, Object obj, a.e eVar) {
            cVar.g0((b) ((ArrayList) obj).get(0), new o(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void f(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.F((b) arrayList.get(0), (String) arrayList.get(1), new q(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void h(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.k0((b) arrayList.get(0), (String) arrayList.get(1), new n(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void k(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.z((b) arrayList.get(0), (String) arrayList.get(1), new i(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void l0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.n0((b) arrayList.get(0), (String) arrayList.get(1), new l(new ArrayList(), eVar));
        }

        static void m0(sc.b bVar, String str, final c cVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener" + str2, a());
            if (cVar != null) {
                aVar.e(new a.d() { // from class: yc.b1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.V(this.f23836a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener" + str2, a());
            if (cVar != null) {
                aVar2.e(new a.d() { // from class: yc.d1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.d0(this.f23846a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator" + str2, a());
            if (cVar != null) {
                aVar3.e(new a.d() { // from class: yc.g1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.o0(this.f23861a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode" + str2, a());
            if (cVar != null) {
                aVar4.e(new a.d() { // from class: yc.h1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.f(this.f23865a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode" + str2, a());
            if (cVar != null) {
                aVar5.e(new a.d() { // from class: yc.i1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.n(this.f23869a, obj, eVar);
                    }
                });
            } else {
                aVar5.e(null);
            }
            sc.a aVar6 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset" + str2, a());
            if (cVar != null) {
                aVar6.e(new a.d() { // from class: yc.j1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.s(this.f23873a, obj, eVar);
                    }
                });
            } else {
                aVar6.e(null);
            }
            sc.a aVar7 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword" + str2, a());
            if (cVar != null) {
                aVar7.e(new a.d() { // from class: yc.k1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.H(this.f23877a, obj, eVar);
                    }
                });
            } else {
                aVar7.e(null);
            }
            sc.a aVar8 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously" + str2, a());
            if (cVar != null) {
                aVar8.e(new a.d() { // from class: yc.l1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.O(this.f23883a, obj, eVar);
                    }
                });
            } else {
                aVar8.e(null);
            }
            sc.a aVar9 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential" + str2, a());
            if (cVar != null) {
                aVar9.e(new a.d() { // from class: yc.n1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.L(this.f23891a, obj, eVar);
                    }
                });
            } else {
                aVar9.e(null);
            }
            sc.a aVar10 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken" + str2, a());
            if (cVar != null) {
                aVar10.e(new a.d() { // from class: yc.o1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.S(this.f23897a, obj, eVar);
                    }
                });
            } else {
                aVar10.e(null);
            }
            sc.a aVar11 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword" + str2, a());
            if (cVar != null) {
                aVar11.e(new a.d() { // from class: yc.m1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.c0(this.f23886a, obj, eVar);
                    }
                });
            } else {
                aVar11.e(null);
            }
            sc.a aVar12 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink" + str2, a());
            if (cVar != null) {
                aVar12.e(new a.d() { // from class: yc.p1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.p0(this.f23902a, obj, eVar);
                    }
                });
            } else {
                aVar12.e(null);
            }
            sc.a aVar13 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider" + str2, a());
            if (cVar != null) {
                aVar13.e(new a.d() { // from class: yc.q1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.P(this.f23906a, obj, eVar);
                    }
                });
            } else {
                aVar13.e(null);
            }
            sc.a aVar14 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut" + str2, a());
            if (cVar != null) {
                aVar14.e(new a.d() { // from class: yc.r1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.Q(this.f23910a, obj, eVar);
                    }
                });
            } else {
                aVar14.e(null);
            }
            sc.a aVar15 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail" + str2, a());
            if (cVar != null) {
                aVar15.e(new a.d() { // from class: yc.s1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.p(this.f23914a, obj, eVar);
                    }
                });
            } else {
                aVar15.e(null);
            }
            sc.a aVar16 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail" + str2, a());
            if (cVar != null) {
                aVar16.e(new a.d() { // from class: yc.t1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.A(this.f23918a, obj, eVar);
                    }
                });
            } else {
                aVar16.e(null);
            }
            sc.a aVar17 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail" + str2, a());
            if (cVar != null) {
                aVar17.e(new a.d() { // from class: yc.u1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.b(this.f23930a, obj, eVar);
                    }
                });
            } else {
                aVar17.e(null);
            }
            sc.a aVar18 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode" + str2, a());
            if (cVar != null) {
                aVar18.e(new a.d() { // from class: yc.v1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.k(this.f23933a, obj, eVar);
                    }
                });
            } else {
                aVar18.e(null);
            }
            sc.a aVar19 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings" + str2, a());
            if (cVar != null) {
                aVar19.e(new a.d() { // from class: yc.w1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.a0(this.f23941a, obj, eVar);
                    }
                });
            } else {
                aVar19.e(null);
            }
            sc.a aVar20 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode" + str2, a());
            if (cVar != null) {
                aVar20.e(new a.d() { // from class: yc.c1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.l0(this.f23841a, obj, eVar);
                    }
                });
            } else {
                aVar20.e(null);
            }
            sc.a aVar21 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber" + str2, a());
            if (cVar != null) {
                aVar21.e(new a.d() { // from class: yc.e1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.G(this.f23851a, obj, eVar);
                    }
                });
            } else {
                aVar21.e(null);
            }
            sc.a aVar22 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode" + str2, a());
            if (cVar != null) {
                aVar22.e(new a.d() { // from class: yc.f1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.c.h(this.f23856a, obj, eVar);
                    }
                });
            } else {
                aVar22.e(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void n(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.h0((b) arrayList.get(0), (String) arrayList.get(1), new r(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void o0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            b bVar = (b) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Number number = (Number) arrayList2.get(2);
            cVar.e(bVar, str, number == null ? null : Long.valueOf(number.longValue()), new p(arrayList, eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void p(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.E((b) arrayList.get(0), (String) arrayList.get(1), new f(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void p0(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.j((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new C0488c(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void s(c cVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            cVar.T((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new s(new ArrayList(), eVar));
        }

        void E(b bVar, String str, f0<List<String>> f0Var);

        void F(b bVar, String str, g0 g0Var);

        void J(b bVar, String str, String str2, f0<a0> f0Var);

        void T(b bVar, String str, String str2, g0 g0Var);

        void U(b bVar, e0 e0Var, f0<String> f0Var);

        void X(b bVar, g0 g0Var);

        void c(b bVar, String str, f0<a0> f0Var);

        void d(b bVar, Map<String, Object> map, f0<a0> f0Var);

        void e(b bVar, String str, Long l10, g0 g0Var);

        void e0(b bVar, String str, q qVar, g0 g0Var);

        void f0(b bVar, y yVar, f0<a0> f0Var);

        void g0(b bVar, f0<String> f0Var);

        void h0(b bVar, String str, f0<o> f0Var);

        void i(b bVar, f0<a0> f0Var);

        void j(b bVar, String str, String str2, f0<a0> f0Var);

        void k0(b bVar, String str, g0 g0Var);

        void l(b bVar, String str, q qVar, g0 g0Var);

        void n0(b bVar, String str, f0<String> f0Var);

        void o(b bVar, t tVar, g0 g0Var);

        void q(b bVar, f0<String> f0Var);

        void r(b bVar, String str, String str2, f0<a0> f0Var);

        void z(b bVar, String str, f0<String> f0Var);
    }

    public static final class c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f23667f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Boolean f23668g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f23669h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f23670i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f23671j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Long f23672k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Long f23673l;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23675b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f23676c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f23677d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f23678e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Boolean f23679f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Boolean f23680g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f23681h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f23682i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private String f23683j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Long f23684k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Long f23685l;

            public c0 a() {
                c0 c0Var = new c0();
                c0Var.m(this.f23674a);
                c0Var.d(this.f23675b);
                c0Var.c(this.f23676c);
                c0Var.i(this.f23677d);
                c0Var.h(this.f23678e);
                c0Var.e(this.f23679f);
                c0Var.f(this.f23680g);
                c0Var.j(this.f23681h);
                c0Var.l(this.f23682i);
                c0Var.k(this.f23683j);
                c0Var.b(this.f23684k);
                c0Var.g(this.f23685l);
                return c0Var;
            }

            public a b(Long l10) {
                this.f23684k = l10;
                return this;
            }

            public a c(String str) {
                this.f23676c = str;
                return this;
            }

            public a d(String str) {
                this.f23675b = str;
                return this;
            }

            public a e(Boolean bool) {
                this.f23679f = bool;
                return this;
            }

            public a f(Boolean bool) {
                this.f23680g = bool;
                return this;
            }

            public a g(Long l10) {
                this.f23685l = l10;
                return this;
            }

            public a h(String str) {
                this.f23678e = str;
                return this;
            }

            public a i(String str) {
                this.f23677d = str;
                return this;
            }

            public a j(String str) {
                this.f23682i = str;
                return this;
            }

            public a k(String str) {
                this.f23674a = str;
                return this;
            }
        }

        c0() {
        }

        static c0 a(ArrayList<Object> arrayList) {
            Long lValueOf;
            c0 c0Var = new c0();
            c0Var.m((String) arrayList.get(0));
            c0Var.d((String) arrayList.get(1));
            c0Var.c((String) arrayList.get(2));
            c0Var.i((String) arrayList.get(3));
            c0Var.h((String) arrayList.get(4));
            c0Var.e((Boolean) arrayList.get(5));
            c0Var.f((Boolean) arrayList.get(6));
            c0Var.j((String) arrayList.get(7));
            c0Var.l((String) arrayList.get(8));
            c0Var.k((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            c0Var.b(lValueOf);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            c0Var.g(lValueOf2);
            return c0Var;
        }

        public void b(Long l10) {
            this.f23672k = l10;
        }

        public void c(String str) {
            this.f23664c = str;
        }

        public void d(String str) {
            this.f23663b = str;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
            }
            this.f23667f = bool;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
            }
            this.f23668g = bool;
        }

        public void g(Long l10) {
            this.f23673l = l10;
        }

        public void h(String str) {
            this.f23666e = str;
        }

        public void i(String str) {
            this.f23665d = str;
        }

        public void j(String str) {
            this.f23669h = str;
        }

        public void k(String str) {
            this.f23671j = str;
        }

        public void l(String str) {
            this.f23670i = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f23662a = str;
        }

        ArrayList<Object> n() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.f23662a);
            arrayList.add(this.f23663b);
            arrayList.add(this.f23664c);
            arrayList.add(this.f23665d);
            arrayList.add(this.f23666e);
            arrayList.add(this.f23667f);
            arrayList.add(this.f23668g);
            arrayList.add(this.f23669h);
            arrayList.add(this.f23670i);
            arrayList.add(this.f23671j);
            arrayList.add(this.f23672k);
            arrayList.add(this.f23673l);
            return arrayList;
        }
    }

    private static class d extends sc.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f23686d = new d();

        private d() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case -128:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return a0.a((ArrayList) f(byteBuffer));
                case -114:
                    return b0.a((ArrayList) f(byteBuffer));
                case -113:
                    return c0.a((ArrayList) f(byteBuffer));
                case -112:
                    return d0.a((ArrayList) f(byteBuffer));
                case -111:
                    return e0.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListN;
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                arrayListN = ((b) obj).h();
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                arrayListN = ((o) obj).d();
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                arrayListN = ((p) obj).d();
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                arrayListN = ((q) obj).p();
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                arrayListN = ((r) obj).g();
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                arrayListN = ((s) obj).f();
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                arrayListN = ((t) obj).k();
            } else if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                arrayListN = ((u) obj).i();
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                arrayListN = ((v) obj).g();
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                arrayListN = ((w) obj).c();
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                arrayListN = ((x) obj).f();
            } else if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                arrayListN = ((y) obj).h();
            } else if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                arrayListN = ((z) obj).g();
            } else if (obj instanceof a0) {
                byteArrayOutputStream.write(141);
                arrayListN = ((a0) obj).e();
            } else if (obj instanceof b0) {
                byteArrayOutputStream.write(142);
                arrayListN = ((b0) obj).f();
            } else if (obj instanceof c0) {
                byteArrayOutputStream.write(143);
                arrayListN = ((c0) obj).n();
            } else if (obj instanceof d0) {
                byteArrayOutputStream.write(144);
                arrayListN = ((d0) obj).j();
            } else if (!(obj instanceof e0)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(145);
                arrayListN = ((e0) obj).n();
            }
            p(byteArrayOutputStream, arrayListN);
        }
    }

    public static final class d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f23689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f23690d;

        d0() {
        }

        static d0 a(ArrayList<Object> arrayList) {
            d0 d0Var = new d0();
            d0Var.f((String) arrayList.get(0));
            d0Var.h((String) arrayList.get(1));
            d0Var.g((Boolean) arrayList.get(2));
            d0Var.i((Boolean) arrayList.get(3));
            return d0Var;
        }

        public String b() {
            return this.f23687a;
        }

        public Boolean c() {
            return this.f23689c;
        }

        public String d() {
            return this.f23688b;
        }

        public Boolean e() {
            return this.f23690d;
        }

        public void f(String str) {
            this.f23687a = str;
        }

        public void g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
            }
            this.f23689c = bool;
        }

        public void h(String str) {
            this.f23688b = str;
        }

        public void i(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
            }
            this.f23690d = bool;
        }

        ArrayList<Object> j() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f23687a);
            arrayList.add(this.f23688b);
            arrayList.add(this.f23689c);
            arrayList.add(this.f23690d);
            return arrayList;
        }
    }

    public interface e {

        class a implements f0<b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23692b;

            a(ArrayList arrayList, a.e eVar) {
                this.f23691a = arrayList;
                this.f23692b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23692b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(b0 b0Var) {
                this.f23691a.add(0, b0Var);
                this.f23692b.a(this.f23691a);
            }
        }

        class b implements f0<b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23693a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23694b;

            b(ArrayList arrayList, a.e eVar) {
                this.f23693a = arrayList;
                this.f23694b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23694b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(b0 b0Var) {
                this.f23693a.add(0, b0Var);
                this.f23694b.a(this.f23693a);
            }
        }

        class c implements f0<b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23695a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23696b;

            c(ArrayList arrayList, a.e eVar) {
                this.f23695a = arrayList;
                this.f23696b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23696b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(b0 b0Var) {
                this.f23695a.add(0, b0Var);
                this.f23696b.a(this.f23695a);
            }
        }

        class d implements f0<b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23698b;

            d(ArrayList arrayList, a.e eVar) {
                this.f23697a = arrayList;
                this.f23698b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23698b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(b0 b0Var) {
                this.f23697a.add(0, b0Var);
                this.f23698b.a(this.f23697a);
            }
        }

        /* JADX INFO: renamed from: yc.a1$e$e, reason: collision with other inner class name */
        class C0489e implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23699a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23700b;

            C0489e(ArrayList arrayList, a.e eVar) {
                this.f23699a = arrayList;
                this.f23700b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23700b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23699a.add(0, null);
                this.f23700b.a(this.f23699a);
            }
        }

        class f implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23702b;

            f(ArrayList arrayList, a.e eVar) {
                this.f23701a = arrayList;
                this.f23702b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23702b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23701a.add(0, null);
                this.f23702b.a(this.f23701a);
            }
        }

        class g implements f0<u> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23703a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23704b;

            g(ArrayList arrayList, a.e eVar) {
                this.f23703a = arrayList;
                this.f23704b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23704b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(u uVar) {
                this.f23703a.add(0, uVar);
                this.f23704b.a(this.f23703a);
            }
        }

        class h implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23705a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23706b;

            h(ArrayList arrayList, a.e eVar) {
                this.f23705a = arrayList;
                this.f23706b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23706b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23705a.add(0, a0Var);
                this.f23706b.a(this.f23705a);
            }
        }

        class i implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23707a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23708b;

            i(ArrayList arrayList, a.e eVar) {
                this.f23707a = arrayList;
                this.f23708b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23708b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23707a.add(0, a0Var);
                this.f23708b.a(this.f23707a);
            }
        }

        class j implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23709a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23710b;

            j(ArrayList arrayList, a.e eVar) {
                this.f23709a = arrayList;
                this.f23710b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23710b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23709a.add(0, a0Var);
                this.f23710b.a(this.f23709a);
            }
        }

        class k implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23711a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23712b;

            k(ArrayList arrayList, a.e eVar) {
                this.f23711a = arrayList;
                this.f23712b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23712b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23711a.add(0, a0Var);
                this.f23712b.a(this.f23711a);
            }
        }

        class l implements f0<b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23714b;

            l(ArrayList arrayList, a.e eVar) {
                this.f23713a = arrayList;
                this.f23714b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23714b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(b0 b0Var) {
                this.f23713a.add(0, b0Var);
                this.f23714b.a(this.f23713a);
            }
        }

        class m implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23716b;

            m(ArrayList arrayList, a.e eVar) {
                this.f23715a = arrayList;
                this.f23716b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23716b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23715a.add(0, null);
                this.f23716b.a(this.f23715a);
            }
        }

        class n implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23717a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23718b;

            n(ArrayList arrayList, a.e eVar) {
                this.f23717a = arrayList;
                this.f23718b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23718b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23717a.add(0, a0Var);
                this.f23718b.a(this.f23717a);
            }
        }

        static void B(sc.b bVar, e eVar) {
            y(bVar, "", eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void I(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.k((b) arrayList.get(0), (y) arrayList.get(1), new i(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void K(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.S((b) arrayList.get(0), (String) arrayList.get(1), new n(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void L(e eVar, Object obj, a.e eVar2) {
            eVar.O((b) ((ArrayList) obj).get(0), new f(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void N(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.d((b) arrayList.get(0), (String) arrayList.get(1), new a(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void P(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.h((b) arrayList.get(0), (Boolean) arrayList.get(1), new g(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void R(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.M((b) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar2));
        }

        static sc.h<Object> a() {
            return f.f23725d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void c(e eVar, Object obj, a.e eVar2) {
            eVar.t((b) ((ArrayList) obj).get(0), new l(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void f(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.z((b) arrayList.get(0), (Map) arrayList.get(1), new c(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void g(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.m((b) arrayList.get(0), (q) arrayList.get(1), new m(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void j(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.C((b) arrayList.get(0), (d0) arrayList.get(1), new d(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void o(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.p((b) arrayList.get(0), (String) arrayList.get(1), (q) arrayList.get(2), new C0489e(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void q(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.H((b) arrayList.get(0), (Map) arrayList.get(1), new j(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void r(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.w((b) arrayList.get(0), (y) arrayList.get(1), new k(new ArrayList(), eVar2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void x(e eVar, Object obj, a.e eVar2) {
            ArrayList arrayList = (ArrayList) obj;
            eVar.F((b) arrayList.get(0), (Map) arrayList.get(1), new h(new ArrayList(), eVar2));
        }

        static void y(sc.b bVar, String str, final e eVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete" + str2, a());
            if (eVar != null) {
                aVar.e(new a.d() { // from class: yc.x1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.L(this.f23947a, obj, eVar2);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken" + str2, a());
            if (eVar != null) {
                aVar2.e(new a.d() { // from class: yc.g2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.P(this.f23862a, obj, eVar2);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential" + str2, a());
            if (eVar != null) {
                aVar3.e(new a.d() { // from class: yc.h2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.x(this.f23866a, obj, eVar2);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider" + str2, a());
            if (eVar != null) {
                aVar4.e(new a.d() { // from class: yc.i2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.I(this.f23870a, obj, eVar2);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential" + str2, a());
            if (eVar != null) {
                aVar5.e(new a.d() { // from class: yc.j2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.q(this.f23874a, obj, eVar2);
                    }
                });
            } else {
                aVar5.e(null);
            }
            sc.a aVar6 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider" + str2, a());
            if (eVar != null) {
                aVar6.e(new a.d() { // from class: yc.k2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.r(this.f23878a, obj, eVar2);
                    }
                });
            } else {
                aVar6.e(null);
            }
            sc.a aVar7 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload" + str2, a());
            if (eVar != null) {
                aVar7.e(new a.d() { // from class: yc.y1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.c(this.f23952a, obj, eVar2);
                    }
                });
            } else {
                aVar7.e(null);
            }
            sc.a aVar8 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification" + str2, a());
            if (eVar != null) {
                aVar8.e(new a.d() { // from class: yc.z1
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.g(this.f23967a, obj, eVar2);
                    }
                });
            } else {
                aVar8.e(null);
            }
            sc.a aVar9 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink" + str2, a());
            if (eVar != null) {
                aVar9.e(new a.d() { // from class: yc.a2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.K(this.f23832a, obj, eVar2);
                    }
                });
            } else {
                aVar9.e(null);
            }
            sc.a aVar10 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail" + str2, a());
            if (eVar != null) {
                aVar10.e(new a.d() { // from class: yc.b2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.N(this.f23837a, obj, eVar2);
                    }
                });
            } else {
                aVar10.e(null);
            }
            sc.a aVar11 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword" + str2, a());
            if (eVar != null) {
                aVar11.e(new a.d() { // from class: yc.c2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.R(this.f23842a, obj, eVar2);
                    }
                });
            } else {
                aVar11.e(null);
            }
            sc.a aVar12 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber" + str2, a());
            if (eVar != null) {
                aVar12.e(new a.d() { // from class: yc.d2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.f(this.f23847a, obj, eVar2);
                    }
                });
            } else {
                aVar12.e(null);
            }
            sc.a aVar13 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile" + str2, a());
            if (eVar != null) {
                aVar13.e(new a.d() { // from class: yc.e2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.j(this.f23852a, obj, eVar2);
                    }
                });
            } else {
                aVar13.e(null);
            }
            sc.a aVar14 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail" + str2, a());
            if (eVar != null) {
                aVar14.e(new a.d() { // from class: yc.f2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar2) {
                        a1.e.o(this.f23857a, obj, eVar2);
                    }
                });
            } else {
                aVar14.e(null);
            }
        }

        void C(b bVar, d0 d0Var, f0<b0> f0Var);

        void F(b bVar, Map<String, Object> map, f0<a0> f0Var);

        void H(b bVar, Map<String, Object> map, f0<a0> f0Var);

        void M(b bVar, String str, f0<b0> f0Var);

        void O(b bVar, g0 g0Var);

        void S(b bVar, String str, f0<a0> f0Var);

        void d(b bVar, String str, f0<b0> f0Var);

        void h(b bVar, Boolean bool, f0<u> f0Var);

        void k(b bVar, y yVar, f0<a0> f0Var);

        void m(b bVar, q qVar, g0 g0Var);

        void p(b bVar, String str, q qVar, g0 g0Var);

        void t(b bVar, f0<b0> f0Var);

        void w(b bVar, y yVar, f0<a0> f0Var);

        void z(b bVar, Map<String, Object> map, f0<b0> f0Var);
    }

    public static final class e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f23720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f23721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f23724f;

        e0() {
        }

        static e0 a(ArrayList<Object> arrayList) {
            Long lValueOf;
            e0 e0Var = new e0();
            e0Var.l((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e0Var.m(lValueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            e0Var.i(lValueOf2);
            e0Var.h((String) arrayList.get(3));
            e0Var.j((String) arrayList.get(4));
            e0Var.k((String) arrayList.get(5));
            return e0Var;
        }

        public String b() {
            return this.f23722d;
        }

        public Long c() {
            return this.f23721c;
        }

        public String d() {
            return this.f23723e;
        }

        public String e() {
            return this.f23724f;
        }

        public String f() {
            return this.f23719a;
        }

        public Long g() {
            return this.f23720b;
        }

        public void h(String str) {
            this.f23722d = str;
        }

        public void i(Long l10) {
            this.f23721c = l10;
        }

        public void j(String str) {
            this.f23723e = str;
        }

        public void k(String str) {
            this.f23724f = str;
        }

        public void l(String str) {
            this.f23719a = str;
        }

        public void m(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"timeout\" is null.");
            }
            this.f23720b = l10;
        }

        ArrayList<Object> n() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.f23719a);
            arrayList.add(this.f23720b);
            arrayList.add(this.f23721c);
            arrayList.add(this.f23722d);
            arrayList.add(this.f23723e);
            arrayList.add(this.f23724f);
            return arrayList;
        }
    }

    private static class f extends sc.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f23725d = new f();

        private f() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case -128:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return a0.a((ArrayList) f(byteBuffer));
                case -114:
                    return b0.a((ArrayList) f(byteBuffer));
                case -113:
                    return c0.a((ArrayList) f(byteBuffer));
                case -112:
                    return d0.a((ArrayList) f(byteBuffer));
                case -111:
                    return e0.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListN;
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                arrayListN = ((b) obj).h();
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                arrayListN = ((o) obj).d();
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                arrayListN = ((p) obj).d();
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                arrayListN = ((q) obj).p();
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                arrayListN = ((r) obj).g();
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                arrayListN = ((s) obj).f();
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                arrayListN = ((t) obj).k();
            } else if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                arrayListN = ((u) obj).i();
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                arrayListN = ((v) obj).g();
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                arrayListN = ((w) obj).c();
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                arrayListN = ((x) obj).f();
            } else if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                arrayListN = ((y) obj).h();
            } else if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                arrayListN = ((z) obj).g();
            } else if (obj instanceof a0) {
                byteArrayOutputStream.write(141);
                arrayListN = ((a0) obj).e();
            } else if (obj instanceof b0) {
                byteArrayOutputStream.write(142);
                arrayListN = ((b0) obj).f();
            } else if (obj instanceof c0) {
                byteArrayOutputStream.write(143);
                arrayListN = ((c0) obj).n();
            } else if (obj instanceof d0) {
                byteArrayOutputStream.write(144);
                arrayListN = ((d0) obj).j();
            } else if (!(obj instanceof e0)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(145);
                arrayListN = ((e0) obj).n();
            }
            p(byteArrayOutputStream, arrayListN);
        }
    }

    public interface f0<T> {
        void a(Throwable th);

        void success(T t10);
    }

    public static class g extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f23727b;

        public g(String str, String str2, Object obj) {
            super(str2);
            this.f23726a = str;
            this.f23727b = obj;
        }
    }

    public interface g0 {
        void a(Throwable th);

        void b();
    }

    public interface h {

        class a implements f0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23728a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23729b;

            a(ArrayList arrayList, a.e eVar) {
                this.f23728a = arrayList;
                this.f23729b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23729b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(a0 a0Var) {
                this.f23728a.add(0, a0Var);
                this.f23729b.a(this.f23728a);
            }
        }

        static sc.h<Object> a() {
            return i.f23730d;
        }

        static void f(sc.b bVar, String str, final h hVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn" + str2, a()).e(hVar != null ? new a.d() { // from class: yc.l2
                @Override // sc.a.d
                public final void a(Object obj, a.e eVar) {
                    a1.h.s(this.f23884a, obj, eVar);
                }
            } : null);
        }

        static void n(sc.b bVar, h hVar) {
            f(bVar, "", hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void s(h hVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            hVar.e((String) arrayList.get(0), (x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        void e(String str, x xVar, String str2, f0<a0> f0Var);
    }

    private static class i extends sc.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f23730d = new i();

        private i() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case -128:
                    return r.a((ArrayList) f(byteBuffer));
                case -127:
                    return s.a((ArrayList) f(byteBuffer));
                case -126:
                    return x.a((ArrayList) f(byteBuffer));
                case -125:
                    return a0.a((ArrayList) f(byteBuffer));
                case -124:
                    return b0.a((ArrayList) f(byteBuffer));
                case -123:
                    return c0.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListN;
            if (obj instanceof r) {
                byteArrayOutputStream.write(128);
                arrayListN = ((r) obj).g();
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(129);
                arrayListN = ((s) obj).f();
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(130);
                arrayListN = ((x) obj).f();
            } else if (obj instanceof a0) {
                byteArrayOutputStream.write(131);
                arrayListN = ((a0) obj).e();
            } else if (obj instanceof b0) {
                byteArrayOutputStream.write(132);
                arrayListN = ((b0) obj).f();
            } else if (!(obj instanceof c0)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(133);
                arrayListN = ((c0) obj).n();
            }
            p(byteArrayOutputStream, arrayListN);
        }
    }

    public interface j {

        class a implements f0<z> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23732b;

            a(ArrayList arrayList, a.e eVar) {
                this.f23731a = arrayList;
                this.f23732b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23732b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(z zVar) {
                this.f23731a.add(0, zVar);
                this.f23732b.a(this.f23731a);
            }
        }

        class b implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23733a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23734b;

            b(ArrayList arrayList, a.e eVar) {
                this.f23733a = arrayList;
                this.f23734b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23734b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23733a.add(0, str);
                this.f23734b.a(this.f23733a);
            }
        }

        class c implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23736b;

            c(ArrayList arrayList, a.e eVar) {
                this.f23735a = arrayList;
                this.f23736b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23736b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23735a.add(0, str);
                this.f23736b.a(this.f23735a);
            }
        }

        static sc.h<Object> a() {
            return k.f23737d;
        }

        static void b(sc.b bVar, String str, final j jVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret" + str2, a());
            if (jVar != null) {
                aVar.e(new a.d() { // from class: yc.m2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.j.i(this.f23887a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment" + str2, a());
            if (jVar != null) {
                aVar2.e(new a.d() { // from class: yc.n2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.j.g(this.f23892a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn" + str2, a());
            if (jVar != null) {
                aVar3.e(new a.d() { // from class: yc.o2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.j.e(this.f23898a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
        }

        static void c(sc.b bVar, j jVar) {
            b(bVar, "", jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void e(j jVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            jVar.j((String) arrayList.get(0), (String) arrayList.get(1), new c(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void g(j jVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            jVar.d((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void i(j jVar, Object obj, a.e eVar) {
            jVar.f((String) ((ArrayList) obj).get(0), new a(new ArrayList(), eVar));
        }

        void d(String str, String str2, f0<String> f0Var);

        void f(String str, f0<z> f0Var);

        void j(String str, String str2, f0<String> f0Var);
    }

    private static class k extends sc.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k f23737d = new k();

        private k() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != -128 ? super.g(b10, byteBuffer) : z.a((ArrayList) f(byteBuffer));
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof z)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((z) obj).g());
            }
        }
    }

    public interface l {

        class a implements f0<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23739b;

            a(ArrayList arrayList, a.e eVar) {
                this.f23738a = arrayList;
                this.f23739b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23739b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(String str) {
                this.f23738a.add(0, str);
                this.f23739b.a(this.f23738a);
            }
        }

        class b implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23740a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23741b;

            b(ArrayList arrayList, a.e eVar) {
                this.f23740a = arrayList;
                this.f23741b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23741b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23740a.add(0, null);
                this.f23741b.a(this.f23740a);
            }
        }

        static sc.h<Object> a() {
            return new sc.p();
        }

        static void c(sc.b bVar, l lVar) {
            h(bVar, "", lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void f(l lVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            lVar.e((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void g(l lVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            lVar.d((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
        }

        static void h(sc.b bVar, String str, final l lVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl" + str2, a());
            if (lVar != null) {
                aVar.e(new a.d() { // from class: yc.p2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.l.f(this.f23903a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp" + str2, a());
            if (lVar != null) {
                aVar2.e(new a.d() { // from class: yc.q2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.l.g(this.f23907a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
        }

        void d(String str, String str2, g0 g0Var);

        void e(String str, String str2, String str3, f0<String> f0Var);
    }

    public interface m {

        class a implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23743b;

            a(ArrayList arrayList, a.e eVar) {
                this.f23742a = arrayList;
                this.f23743b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23743b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23742a.add(0, null);
                this.f23743b.a(this.f23742a);
            }
        }

        class b implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23744a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23745b;

            b(ArrayList arrayList, a.e eVar) {
                this.f23744a = arrayList;
                this.f23745b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23745b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23744a.add(0, null);
                this.f23745b.a(this.f23744a);
            }
        }

        class c implements f0<w> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23746a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23747b;

            c(ArrayList arrayList, a.e eVar) {
                this.f23746a = arrayList;
                this.f23747b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23747b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(w wVar) {
                this.f23746a.add(0, wVar);
                this.f23747b.a(this.f23746a);
            }
        }

        class d implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23748a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23749b;

            d(ArrayList arrayList, a.e eVar) {
                this.f23748a = arrayList;
                this.f23749b = eVar;
            }

            @Override // yc.a1.g0
            public void a(Throwable th) {
                this.f23749b.a(a1.a(th));
            }

            @Override // yc.a1.g0
            public void b() {
                this.f23748a.add(0, null);
                this.f23749b.a(this.f23748a);
            }
        }

        class e implements f0<List<v>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList f23750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.e f23751b;

            e(ArrayList arrayList, a.e eVar) {
                this.f23750a = arrayList;
                this.f23751b = eVar;
            }

            @Override // yc.a1.f0
            public void a(Throwable th) {
                this.f23751b.a(a1.a(th));
            }

            @Override // yc.a1.f0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void success(List<v> list) {
                this.f23750a.add(0, list);
                this.f23751b.a(this.f23750a);
            }
        }

        static sc.h<Object> a() {
            return n.f23752d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void b(m mVar, Object obj, a.e eVar) {
            mVar.i((b) ((ArrayList) obj).get(0), new c(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void d(m mVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            mVar.o((b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new b(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void h(m mVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            mVar.q((b) arrayList.get(0), (String) arrayList.get(1), new d(new ArrayList(), eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void j(m mVar, Object obj, a.e eVar) {
            mVar.v((b) ((ArrayList) obj).get(0), new e(new ArrayList(), eVar));
        }

        static void k(sc.b bVar, String str, final m mVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone" + str2, a());
            if (mVar != null) {
                aVar.e(new a.d() { // from class: yc.r2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.m.t(this.f23911a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp" + str2, a());
            if (mVar != null) {
                aVar2.e(new a.d() { // from class: yc.s2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.m.d(this.f23915a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession" + str2, a());
            if (mVar != null) {
                aVar3.e(new a.d() { // from class: yc.t2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.m.b(this.f23919a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll" + str2, a());
            if (mVar != null) {
                aVar4.e(new a.d() { // from class: yc.u2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.m.h(this.f23931a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors" + str2, a());
            if (mVar != null) {
                aVar5.e(new a.d() { // from class: yc.v2
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a1.m.j(this.f23934a, obj, eVar);
                    }
                });
            } else {
                aVar5.e(null);
            }
        }

        static void r(sc.b bVar, m mVar) {
            k(bVar, "", mVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void t(m mVar, Object obj, a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            mVar.c((b) arrayList.get(0), (x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
        }

        void c(b bVar, x xVar, String str, g0 g0Var);

        void i(b bVar, f0<w> f0Var);

        void o(b bVar, String str, String str2, g0 g0Var);

        void q(b bVar, String str, g0 g0Var);

        void v(b bVar, f0<List<v>> f0Var);
    }

    private static class n extends sc.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n f23752d = new n();

        private n() {
        }

        @Override // sc.p
        protected Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case -128:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return v.a((ArrayList) f(byteBuffer));
                case -126:
                    return w.a((ArrayList) f(byteBuffer));
                case -125:
                    return x.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        @Override // sc.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> arrayListF;
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                arrayListF = ((b) obj).h();
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(129);
                arrayListF = ((v) obj).g();
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(130);
                arrayListF = ((w) obj).c();
            } else if (!(obj instanceof x)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(131);
                arrayListF = ((x) obj).f();
            }
            p(byteArrayOutputStream, arrayListF);
        }
    }

    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f23753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f23754b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private a f23755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p f23756b;

            public o a() {
                o oVar = new o();
                oVar.c(this.f23755a);
                oVar.b(this.f23756b);
                return oVar;
            }

            public a b(p pVar) {
                this.f23756b = pVar;
                return this;
            }

            public a c(a aVar) {
                this.f23755a = aVar;
                return this;
            }
        }

        o() {
        }

        static o a(ArrayList<Object> arrayList) {
            o oVar = new o();
            oVar.c(a.values()[((Integer) arrayList.get(0)).intValue()]);
            oVar.b((p) arrayList.get(1));
            return oVar;
        }

        public void b(p pVar) {
            if (pVar == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.f23754b = pVar;
        }

        public void c(a aVar) {
            if (aVar == null) {
                throw new IllegalStateException("Nonnull field \"operation\" is null.");
            }
            this.f23753a = aVar;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            a aVar = this.f23753a;
            arrayList.add(aVar == null ? null : Integer.valueOf(aVar.f23604a));
            arrayList.add(this.f23754b);
            return arrayList;
        }
    }

    public static final class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23758b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23760b;

            public p a() {
                p pVar = new p();
                pVar.b(this.f23759a);
                pVar.c(this.f23760b);
                return pVar;
            }

            public a b(String str) {
                this.f23759a = str;
                return this;
            }

            public a c(String str) {
                this.f23760b = str;
                return this;
            }
        }

        static p a(ArrayList<Object> arrayList) {
            p pVar = new p();
            pVar.b((String) arrayList.get(0));
            pVar.c((String) arrayList.get(1));
            return pVar;
        }

        public void b(String str) {
            this.f23757a = str;
        }

        public void c(String str) {
            this.f23758b = str;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f23757a);
            arrayList.add(this.f23758b);
            return arrayList;
        }
    }

    public static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f23763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f23766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f23767g;

        q() {
        }

        static q a(ArrayList<Object> arrayList) {
            q qVar = new q();
            qVar.o((String) arrayList.get(0));
            qVar.l((String) arrayList.get(1));
            qVar.m((Boolean) arrayList.get(2));
            qVar.n((String) arrayList.get(3));
            qVar.k((String) arrayList.get(4));
            qVar.i((Boolean) arrayList.get(5));
            qVar.j((String) arrayList.get(6));
            return qVar;
        }

        public Boolean b() {
            return this.f23766f;
        }

        public String c() {
            return this.f23767g;
        }

        public String d() {
            return this.f23765e;
        }

        public String e() {
            return this.f23762b;
        }

        public Boolean f() {
            return this.f23763c;
        }

        public String g() {
            return this.f23764d;
        }

        public String h() {
            return this.f23761a;
        }

        public void i(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
            }
            this.f23766f = bool;
        }

        public void j(String str) {
            this.f23767g = str;
        }

        public void k(String str) {
            this.f23765e = str;
        }

        public void l(String str) {
            this.f23762b = str;
        }

        public void m(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
            }
            this.f23763c = bool;
        }

        public void n(String str) {
            this.f23764d = str;
        }

        public void o(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.f23761a = str;
        }

        ArrayList<Object> p() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.f23761a);
            arrayList.add(this.f23762b);
            arrayList.add(this.f23763c);
            arrayList.add(this.f23764d);
            arrayList.add(this.f23765e);
            arrayList.add(this.f23766f);
            arrayList.add(this.f23767g);
            return arrayList;
        }
    }

    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f23768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, Object> f23772e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Boolean f23773a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23774b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f23775c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f23776d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Map<String, Object> f23777e;

            public r a() {
                r rVar = new r();
                rVar.c(this.f23773a);
                rVar.e(this.f23774b);
                rVar.f(this.f23775c);
                rVar.b(this.f23776d);
                rVar.d(this.f23777e);
                return rVar;
            }

            public a b(Boolean bool) {
                this.f23773a = bool;
                return this;
            }

            public a c(Map<String, Object> map) {
                this.f23777e = map;
                return this;
            }

            public a d(String str) {
                this.f23774b = str;
                return this;
            }

            public a e(String str) {
                this.f23775c = str;
                return this;
            }
        }

        r() {
        }

        static r a(ArrayList<Object> arrayList) {
            r rVar = new r();
            rVar.c((Boolean) arrayList.get(0));
            rVar.e((String) arrayList.get(1));
            rVar.f((String) arrayList.get(2));
            rVar.b((String) arrayList.get(3));
            rVar.d((Map) arrayList.get(4));
            return rVar;
        }

        public void b(String str) {
            this.f23771d = str;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
            }
            this.f23768a = bool;
        }

        public void d(Map<String, Object> map) {
            this.f23772e = map;
        }

        public void e(String str) {
            this.f23769b = str;
        }

        public void f(String str) {
            this.f23770c = str;
        }

        ArrayList<Object> g() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f23768a);
            arrayList.add(this.f23769b);
            arrayList.add(this.f23770c);
            arrayList.add(this.f23771d);
            arrayList.add(this.f23772e);
            return arrayList;
        }
    }

    public static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f23780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23781d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23783b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f23784c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f23785d;

            public s a() {
                s sVar = new s();
                sVar.d(this.f23782a);
                sVar.e(this.f23783b);
                sVar.c(this.f23784c);
                sVar.b(this.f23785d);
                return sVar;
            }

            public a b(String str) {
                this.f23785d = str;
                return this;
            }

            public a c(Long l10) {
                this.f23784c = l10;
                return this;
            }

            public a d(String str) {
                this.f23782a = str;
                return this;
            }

            public a e(String str) {
                this.f23783b = str;
                return this;
            }
        }

        s() {
        }

        static s a(ArrayList<Object> arrayList) {
            Long lValueOf;
            s sVar = new s();
            sVar.d((String) arrayList.get(0));
            sVar.e((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.c(lValueOf);
            sVar.b((String) arrayList.get(3));
            return sVar;
        }

        public void b(String str) {
            this.f23781d = str;
        }

        public void c(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
            }
            this.f23780c = l10;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.f23778a = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
            }
            this.f23779b = str;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f23778a);
            arrayList.add(this.f23779b);
            arrayList.add(this.f23780c);
            arrayList.add(this.f23781d);
            return arrayList;
        }
    }

    public static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f23786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f23790e;

        t() {
        }

        static t a(ArrayList<Object> arrayList) {
            t tVar = new t();
            tVar.f((Boolean) arrayList.get(0));
            tVar.j((String) arrayList.get(1));
            tVar.h((String) arrayList.get(2));
            tVar.i((String) arrayList.get(3));
            tVar.g((Boolean) arrayList.get(4));
            return tVar;
        }

        public Boolean b() {
            return this.f23786a;
        }

        public Boolean c() {
            return this.f23790e;
        }

        public String d() {
            return this.f23788c;
        }

        public String e() {
            return this.f23789d;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
            }
            this.f23786a = bool;
        }

        public void g(Boolean bool) {
            this.f23790e = bool;
        }

        public void h(String str) {
            this.f23788c = str;
        }

        public void i(String str) {
            this.f23789d = str;
        }

        public void j(String str) {
            this.f23787b = str;
        }

        ArrayList<Object> k() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f23786a);
            arrayList.add(this.f23787b);
            arrayList.add(this.f23788c);
            arrayList.add(this.f23789d);
            arrayList.add(this.f23790e);
            return arrayList;
        }
    }

    public static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f23792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f23793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f23794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, Object> f23796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f23797g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23798a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f23799b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f23800c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Long f23801d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f23802e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Map<String, Object> f23803f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f23804g;

            public u a() {
                u uVar = new u();
                uVar.h(this.f23798a);
                uVar.d(this.f23799b);
                uVar.b(this.f23800c);
                uVar.e(this.f23801d);
                uVar.f(this.f23802e);
                uVar.c(this.f23803f);
                uVar.g(this.f23804g);
                return uVar;
            }

            public a b(Long l10) {
                this.f23800c = l10;
                return this;
            }

            public a c(Map<String, Object> map) {
                this.f23803f = map;
                return this;
            }

            public a d(Long l10) {
                this.f23799b = l10;
                return this;
            }

            public a e(Long l10) {
                this.f23801d = l10;
                return this;
            }

            public a f(String str) {
                this.f23802e = str;
                return this;
            }

            public a g(String str) {
                this.f23804g = str;
                return this;
            }

            public a h(String str) {
                this.f23798a = str;
                return this;
            }
        }

        static u a(ArrayList<Object> arrayList) {
            Long lValueOf;
            Long lValueOf2;
            u uVar = new u();
            uVar.h((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long lValueOf3 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            uVar.d(lValueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            uVar.b(lValueOf2);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            uVar.e(lValueOf3);
            uVar.f((String) arrayList.get(4));
            uVar.c((Map) arrayList.get(5));
            uVar.g((String) arrayList.get(6));
            return uVar;
        }

        public void b(Long l10) {
            this.f23793c = l10;
        }

        public void c(Map<String, Object> map) {
            this.f23796f = map;
        }

        public void d(Long l10) {
            this.f23792b = l10;
        }

        public void e(Long l10) {
            this.f23794d = l10;
        }

        public void f(String str) {
            this.f23795e = str;
        }

        public void g(String str) {
            this.f23797g = str;
        }

        public void h(String str) {
            this.f23791a = str;
        }

        ArrayList<Object> i() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.f23791a);
            arrayList.add(this.f23792b);
            arrayList.add(this.f23793c);
            arrayList.add(this.f23794d);
            arrayList.add(this.f23795e);
            arrayList.add(this.f23796f);
            arrayList.add(this.f23797g);
            return arrayList;
        }
    }

    public static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f23806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23809e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23810a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Double f23811b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f23812c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f23813d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f23814e;

            public v a() {
                v vVar = new v();
                vVar.b(this.f23810a);
                vVar.c(this.f23811b);
                vVar.d(this.f23812c);
                vVar.f(this.f23813d);
                vVar.e(this.f23814e);
                return vVar;
            }

            public a b(String str) {
                this.f23810a = str;
                return this;
            }

            public a c(Double d10) {
                this.f23811b = d10;
                return this;
            }

            public a d(String str) {
                this.f23812c = str;
                return this;
            }

            public a e(String str) {
                this.f23814e = str;
                return this;
            }

            public a f(String str) {
                this.f23813d = str;
                return this;
            }
        }

        v() {
        }

        static v a(ArrayList<Object> arrayList) {
            v vVar = new v();
            vVar.b((String) arrayList.get(0));
            vVar.c((Double) arrayList.get(1));
            vVar.d((String) arrayList.get(2));
            vVar.f((String) arrayList.get(3));
            vVar.e((String) arrayList.get(4));
            return vVar;
        }

        public void b(String str) {
            this.f23805a = str;
        }

        public void c(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.f23806b = d10;
        }

        public void d(String str) {
            this.f23807c = str;
        }

        public void e(String str) {
            this.f23809e = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f23808d = str;
        }

        ArrayList<Object> g() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f23805a);
            arrayList.add(this.f23806b);
            arrayList.add(this.f23807c);
            arrayList.add(this.f23808d);
            arrayList.add(this.f23809e);
            return arrayList;
        }
    }

    public static final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23815a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f23816a;

            public w a() {
                w wVar = new w();
                wVar.b(this.f23816a);
                return wVar;
            }

            public a b(String str) {
                this.f23816a = str;
                return this;
            }
        }

        w() {
        }

        static w a(ArrayList<Object> arrayList) {
            w wVar = new w();
            wVar.b((String) arrayList.get(0));
            return wVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f23815a = str;
        }

        ArrayList<Object> c() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f23815a);
            return arrayList;
        }
    }

    public static final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23818b;

        x() {
        }

        static x a(ArrayList<Object> arrayList) {
            x xVar = new x();
            xVar.e((String) arrayList.get(0));
            xVar.d((String) arrayList.get(1));
            return xVar;
        }

        public String b() {
            return this.f23818b;
        }

        public String c() {
            return this.f23817a;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.f23818b = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.f23817a = str;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f23817a);
            arrayList.add(this.f23818b);
            return arrayList;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f23820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f23821c;

        y() {
        }

        static y a(ArrayList<Object> arrayList) {
            y yVar = new y();
            yVar.f((String) arrayList.get(0));
            yVar.g((List) arrayList.get(1));
            yVar.e((Map) arrayList.get(2));
            return yVar;
        }

        public Map<String, String> b() {
            return this.f23821c;
        }

        public String c() {
            return this.f23819a;
        }

        public List<String> d() {
            return this.f23820b;
        }

        public void e(Map<String, String> map) {
            this.f23821c = map;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.f23819a = str;
        }

        public void g(List<String> list) {
            this.f23820b = list;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f23819a);
            arrayList.add(this.f23820b);
            arrayList.add(this.f23821c);
            return arrayList;
        }
    }

    public static final class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f23822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f23823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f23824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23826e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f23827a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f23828b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f23829c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f23830d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f23831e;

            public z a() {
                z zVar = new z();
                zVar.b(this.f23827a);
                zVar.c(this.f23828b);
                zVar.d(this.f23829c);
                zVar.e(this.f23830d);
                zVar.f(this.f23831e);
                return zVar;
            }

            public a b(Long l10) {
                this.f23827a = l10;
                return this;
            }

            public a c(Long l10) {
                this.f23828b = l10;
                return this;
            }

            public a d(Long l10) {
                this.f23829c = l10;
                return this;
            }

            public a e(String str) {
                this.f23830d = str;
                return this;
            }

            public a f(String str) {
                this.f23831e = str;
                return this;
            }
        }

        z() {
        }

        static z a(ArrayList<Object> arrayList) {
            Long lValueOf;
            Long lValueOf2;
            z zVar = new z();
            Object obj = arrayList.get(0);
            Long lValueOf3 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            zVar.b(lValueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            zVar.c(lValueOf2);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            zVar.d(lValueOf3);
            zVar.e((String) arrayList.get(3));
            zVar.f((String) arrayList.get(4));
            return zVar;
        }

        public void b(Long l10) {
            this.f23822a = l10;
        }

        public void c(Long l10) {
            this.f23823b = l10;
        }

        public void d(Long l10) {
            this.f23824c = l10;
        }

        public void e(String str) {
            this.f23825d = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
            }
            this.f23826e = str;
        }

        ArrayList<Object> g() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f23822a);
            arrayList.add(this.f23823b);
            arrayList.add(this.f23824c);
            arrayList.add(this.f23825d);
            arrayList.add(this.f23826e);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof g) {
            g gVar = (g) th;
            arrayList.add(gVar.f23726a);
            arrayList.add(gVar.getMessage());
            obj = gVar.f23727b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}

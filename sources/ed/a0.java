package ed;

import ed.a0;
import java.util.List;
import java.util.Map;
import sc.a;

/* JADX INFO: loaded from: classes2.dex */
public interface a0 {
    public static final a O = a.f10806a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f10806a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final md.l<l> f10807b = md.n.b(C0250a.f10808a);

        /* JADX INFO: renamed from: ed.a0$a$a, reason: collision with other inner class name */
        static final class C0250a extends ae.s implements zd.a<l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0250a f10808a = new C0250a();

            C0250a() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke() {
                return new l();
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            ae.r.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                a0Var.f(str, dDoubleValue, (e0) obj4);
                listB = nd.t.d(null);
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List<String> list2 = (List) obj3;
            Object obj4 = list.get(2);
            ae.r.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                a0Var.k(str, list2, (e0) obj4);
                listB = nd.t.d(null);
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            ae.r.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                a0Var.d(str, zBooleanValue, (e0) obj4);
                listB = nd.t.d(null);
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = nd.t.d(a0Var.e(str, (e0) obj3));
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = nd.t.d(a0Var.b(str, (e0) obj3));
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = nd.t.d(a0Var.c(str, (e0) obj3));
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = nd.t.d(a0Var.i(str, (e0) obj3));
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = nd.t.d(a0Var.a(str, (e0) obj3));
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            ae.r.d(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                a0Var.h(list2, (e0) obj2);
                listB = nd.t.d(null);
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            ae.r.d(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = nd.t.d(a0Var.l(list2, (e0) obj2));
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            ae.r.d(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = nd.t.d(a0Var.m(list2, (e0) obj2));
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            ae.r.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                a0Var.j(str, str2, (e0) obj4);
                listB = nd.t.d(null);
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(a0 a0Var, Object obj, a.e eVar) {
            List listB;
            ae.r.f(eVar, "reply");
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ae.r.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ae.r.d(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            ae.r.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                a0Var.g(str, jLongValue, (e0) obj4);
                listB = nd.t.d(null);
            } catch (Throwable th) {
                listB = m.b(th);
            }
            eVar.a(listB);
        }

        public final sc.h<Object> n() {
            return f10807b.getValue();
        }

        public final void o(sc.b bVar, final a0 a0Var, String str) {
            String str2;
            ae.r.f(bVar, "binaryMessenger");
            ae.r.f(str, "messageChannelSuffix");
            if (str.length() > 0) {
                str2 = "." + str;
            } else {
                str2 = "";
            }
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar.e(new a.d() { // from class: ed.n
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.p(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar2.e(new a.d() { // from class: ed.u
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.y(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar3.e(new a.d() { // from class: ed.v
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.z(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar4.e(new a.d() { // from class: ed.w
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.A(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar5.e(new a.d() { // from class: ed.x
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.B(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar5.e(null);
            }
            sc.a aVar6 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar6.e(new a.d() { // from class: ed.y
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.q(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar6.e(null);
            }
            sc.a aVar7 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar7.e(new a.d() { // from class: ed.z
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.r(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar7.e(null);
            }
            sc.a aVar8 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar8.e(new a.d() { // from class: ed.o
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.s(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar8.e(null);
            }
            sc.a aVar9 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar9.e(new a.d() { // from class: ed.p
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.t(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar9.e(null);
            }
            sc.a aVar10 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar10.e(new a.d() { // from class: ed.q
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.u(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar10.e(null);
            }
            sc.a aVar11 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar11.e(new a.d() { // from class: ed.r
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.v(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar11.e(null);
            }
            sc.a aVar12 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar12.e(new a.d() { // from class: ed.s
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.w(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar12.e(null);
            }
            sc.a aVar13 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys" + str2, n(), bVar.c());
            if (a0Var != null) {
                aVar13.e(new a.d() { // from class: ed.t
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        a0.a.x(a0Var, obj, eVar);
                    }
                });
            } else {
                aVar13.e(null);
            }
        }
    }

    List<String> a(String str, e0 e0Var);

    Boolean b(String str, e0 e0Var);

    Double c(String str, e0 e0Var);

    void d(String str, boolean z10, e0 e0Var);

    String e(String str, e0 e0Var);

    void f(String str, double d10, e0 e0Var);

    void g(String str, long j10, e0 e0Var);

    void h(List<String> list, e0 e0Var);

    Long i(String str, e0 e0Var);

    void j(String str, String str2, e0 e0Var);

    void k(String str, List<String> list, e0 e0Var);

    Map<String, Object> l(List<String> list, e0 e0Var);

    List<String> m(List<String> list, e0 e0Var);
}

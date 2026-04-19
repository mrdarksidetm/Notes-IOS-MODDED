package ed;

import android.util.Log;
import ed.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sc.a;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    public static class a extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10813b;
    }

    public interface b {
        static sc.h<Object> a() {
            return new sc.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void f(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, bVar.remove((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = c.a(th);
            }
            eVar.a(arrayList);
        }

        static void g(sc.b bVar, final b bVar2) {
            sc.a aVar = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", a(), bVar.c());
            if (bVar2 != null) {
                aVar.e(new a.d() { // from class: ed.d
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.f(this.f10817a, obj, eVar);
                    }
                });
            } else {
                aVar.e(null);
            }
            sc.a aVar2 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", a(), bVar.c());
            if (bVar2 != null) {
                aVar2.e(new a.d() { // from class: ed.e
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.v(this.f10818a, obj, eVar);
                    }
                });
            } else {
                aVar2.e(null);
            }
            sc.a aVar3 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", a(), bVar.c());
            if (bVar2 != null) {
                aVar3.e(new a.d() { // from class: ed.f
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.w(this.f10822a, obj, eVar);
                    }
                });
            } else {
                aVar3.e(null);
            }
            sc.a aVar4 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", a(), bVar.c());
            if (bVar2 != null) {
                aVar4.e(new a.d() { // from class: ed.g
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.y(this.f10944a, obj, eVar);
                    }
                });
            } else {
                aVar4.e(null);
            }
            sc.a aVar5 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", a(), bVar.c());
            if (bVar2 != null) {
                aVar5.e(new a.d() { // from class: ed.h
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.p(this.f10947a, obj, eVar);
                    }
                });
            } else {
                aVar5.e(null);
            }
            sc.a aVar6 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setStringList", a(), bVar.c());
            if (bVar2 != null) {
                aVar6.e(new a.d() { // from class: ed.i
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.s(this.f10948a, obj, eVar);
                    }
                });
            } else {
                aVar6.e(null);
            }
            sc.a aVar7 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", a(), bVar.c());
            if (bVar2 != null) {
                aVar7.e(new a.d() { // from class: ed.j
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.k(this.f10949a, obj, eVar);
                    }
                });
            } else {
                aVar7.e(null);
            }
            sc.a aVar8 = new sc.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", a(), bVar.c());
            if (bVar2 != null) {
                aVar8.e(new a.d() { // from class: ed.k
                    @Override // sc.a.d
                    public final void a(Object obj, a.e eVar) {
                        c.b.o(this.f10950a, obj, eVar);
                    }
                });
            } else {
                aVar8.e(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void k(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.i((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = c.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void o(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.d((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = c.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void p(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.u((String) arrayList2.get(0), (Double) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = c.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void s(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.j((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = c.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void v(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.t((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = c.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void w(b bVar, Object obj, a.e eVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.r((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = c.a(th);
            }
            eVar.a(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void y(b bVar, Object obj, a.e eVar) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            String str = (String) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th) {
                    arrayList = c.a(th);
                }
            }
            arrayList.add(0, bVar.q(str, lValueOf));
            eVar.a(arrayList);
        }

        Map<String, Object> d(String str, List<String> list);

        Boolean i(String str, List<String> list);

        Boolean j(String str, List<String> list);

        Boolean q(String str, Long l10);

        Boolean r(String str, String str2);

        Boolean remove(String str);

        Boolean t(String str, Boolean bool);

        Boolean u(String str, Double d10);
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof a) {
            a aVar = (a) th;
            arrayList.add(aVar.f10812a);
            arrayList.add(aVar.getMessage());
            obj = aVar.f10813b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}

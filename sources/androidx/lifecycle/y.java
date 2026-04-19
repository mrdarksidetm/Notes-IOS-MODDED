package androidx.lifecycle;

import android.app.Application;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.InvocationTargetException;
import q4.a;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f4394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f4395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q4.a f4396c;

    public static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static a f4398d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Application f4400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0103a f4397c = new C0103a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a.b<Application> f4399e = C0103a.C0104a.f4401a;

        /* JADX INFO: renamed from: androidx.lifecycle.y$a$a, reason: collision with other inner class name */
        public static final class C0103a {

            /* JADX INFO: renamed from: androidx.lifecycle.y$a$a$a, reason: collision with other inner class name */
            private static final class C0104a implements a.b<Application> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0104a f4401a = new C0104a();

                private C0104a() {
                }
            }

            private C0103a() {
            }

            public /* synthetic */ C0103a(ae.j jVar) {
                this();
            }

            public final b a(o4.q qVar) {
                ae.r.f(qVar, "owner");
                return qVar instanceof e ? ((e) qVar).getDefaultViewModelProviderFactory() : c.Companion.a();
            }

            public final a b(Application application) {
                ae.r.f(application, "application");
                if (a.f4398d == null) {
                    a.f4398d = new a(application);
                }
                a aVar = a.f4398d;
                ae.r.c(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            ae.r.f(application, "application");
        }

        private a(Application application, int i10) {
            this.f4400b = application;
        }

        private final <T extends w> T c(Class<T> cls, Application application) {
            if (!o4.a.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                ae.r.e(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.y.c, androidx.lifecycle.y.b
        public <T extends w> T create(Class<T> cls) {
            ae.r.f(cls, "modelClass");
            Application application = this.f4400b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.y.b
        public <T extends w> T create(Class<T> cls, q4.a aVar) {
            ae.r.f(cls, "modelClass");
            ae.r.f(aVar, "extras");
            if (this.f4400b != null) {
                return (T) create(cls);
            }
            Application application = (Application) aVar.a(f4399e);
            if (application != null) {
                return (T) c(cls, application);
            }
            if (o4.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(cls);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4402a = a.f4403a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f4403a = new a();

            private a() {
            }
        }

        default <T extends w> T create(Class<T> cls) {
            ae.r.f(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends w> T create(Class<T> cls, q4.a aVar) {
            ae.r.f(cls, "modelClass");
            ae.r.f(aVar, "extras");
            return (T) create(cls);
        }
    }

    public static class c implements b {
        public static final a Companion = new a(null);
        public static final a.b<String> VIEW_MODEL_KEY = a.C0105a.f4404a;
        private static c sInstance;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.y$c$a$a, reason: collision with other inner class name */
            private static final class C0105a implements a.b<String> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0105a f4404a = new C0105a();

                private C0105a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }

            public final c a() {
                if (c.sInstance == null) {
                    c.sInstance = new c();
                }
                c cVar = c.sInstance;
                ae.r.c(cVar);
                return cVar;
            }
        }

        public static final c getInstance() {
            return Companion.a();
        }

        @Override // androidx.lifecycle.y.b
        public <T extends w> T create(Class<T> cls) throws InvocationTargetException {
            ae.r.f(cls, "modelClass");
            try {
                T tNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                ae.r.e(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
    }

    public static class d {
        public void a(w wVar) {
            ae.r.f(wVar, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(z zVar, b bVar) {
        this(zVar, bVar, null, 4, null);
        ae.r.f(zVar, ProductResponseJsonKeys.STORE);
        ae.r.f(bVar, "factory");
    }

    public y(z zVar, b bVar, q4.a aVar) {
        ae.r.f(zVar, ProductResponseJsonKeys.STORE);
        ae.r.f(bVar, "factory");
        ae.r.f(aVar, "defaultCreationExtras");
        this.f4394a = zVar;
        this.f4395b = bVar;
        this.f4396c = aVar;
    }

    public /* synthetic */ y(z zVar, b bVar, q4.a aVar, int i10, ae.j jVar) {
        this(zVar, bVar, (i10 & 4) != 0 ? a.C0398a.f18979b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(o4.q qVar) {
        this(qVar.getViewModelStore(), a.f4397c.a(qVar), o4.p.a(qVar));
        ae.r.f(qVar, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(o4.q qVar, b bVar) {
        this(qVar.getViewModelStore(), bVar, o4.p.a(qVar));
        ae.r.f(qVar, "owner");
        ae.r.f(bVar, "factory");
    }

    public <T extends w> T a(Class<T> cls) {
        ae.r.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends w> T b(String str, Class<T> cls) {
        T t10;
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(cls, "modelClass");
        T t11 = (T) this.f4394a.b(str);
        if (!cls.isInstance(t11)) {
            q4.b bVar = new q4.b(this.f4396c);
            bVar.c(c.VIEW_MODEL_KEY, str);
            try {
                t10 = (T) this.f4395b.create(cls, bVar);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f4395b.create(cls);
            }
            this.f4394a.d(str, t10);
            return t10;
        }
        Object obj = this.f4395b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            ae.r.c(t11);
            dVar.a(t11);
        }
        ae.r.d(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }
}

package com.revenuecat.purchases.paywalls.components;

import ae.i0;
import ae.j;
import ae.r;
import ae.s;
import af.j1;
import af.x0;
import af.y;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import he.c;
import java.lang.annotation.Annotation;
import md.l;
import md.n;
import md.p;
import we.b;
import we.e;
import ye.f;
import zd.a;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class ButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final Action action;
    private final StackComponent stack;

    @InternalRevenueCatAPI
    public interface Action {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b<Action> serializer() {
                return ActionSerializer.INSTANCE;
            }
        }

        public static final class NavigateBack implements Action {
            public static final NavigateBack INSTANCE = new NavigateBack();
            private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Action$NavigateBack$1, reason: invalid class name */
            static final class AnonymousClass1 extends s implements a<b<Object>> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // zd.a
                public final b<Object> invoke() {
                    return new x0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateBack", NavigateBack.INSTANCE, new Annotation[0]);
                }
            }

            private NavigateBack() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final b<NavigateBack> serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class NavigateTo implements Action {
            private final Destination destination;
            public static final Companion Companion = new Companion(null);
            private static final b<Object>[] $childSerializers = {new e("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", i0.b(Destination.class), new c[]{i0.b(Destination.CustomerCenter.class), i0.b(Destination.PrivacyPolicy.class), i0.b(Destination.Terms.class), i0.b(Destination.Url.class)}, new b[]{new x0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", Destination.CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0])};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<NavigateTo> serializer() {
                    return ButtonComponent$Action$NavigateTo$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ NavigateTo(int i10, Destination destination, j1 j1Var) {
                if (1 != (i10 & 1)) {
                    z0.a(i10, 1, ButtonComponent$Action$NavigateTo$$serializer.INSTANCE.getDescriptor());
                }
                this.destination = destination;
            }

            public NavigateTo(Destination destination) {
                r.f(destination, "destination");
                this.destination = destination;
            }

            public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, Destination destination, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    destination = navigateTo.destination;
                }
                return navigateTo.copy(destination);
            }

            public final Destination component1() {
                return this.destination;
            }

            public final NavigateTo copy(Destination destination) {
                r.f(destination, "destination");
                return new NavigateTo(destination);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateTo) && r.b(this.destination, ((NavigateTo) obj).destination);
            }

            public final /* synthetic */ Destination getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "NavigateTo(destination=" + this.destination + ')';
            }
        }

        public static final class RestorePurchases implements Action {
            public static final RestorePurchases INSTANCE = new RestorePurchases();
            private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Action$RestorePurchases$1, reason: invalid class name */
            static final class AnonymousClass1 extends s implements a<b<Object>> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // zd.a
                public final b<Object> invoke() {
                    return new x0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.RestorePurchases", RestorePurchases.INSTANCE, new Annotation[0]);
                }
            }

            private RestorePurchases() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final b<RestorePurchases> serializer() {
                return get$cachedSerializer();
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<ButtonComponent> serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }
    }

    @InternalRevenueCatAPI
    public interface Destination {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b<Destination> serializer() {
                return new e("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", i0.b(Destination.class), new c[]{i0.b(CustomerCenter.class), i0.b(PrivacyPolicy.class), i0.b(Terms.class), i0.b(Url.class)}, new b[]{new x0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public static final class CustomerCenter implements Destination {
            public static final CustomerCenter INSTANCE = new CustomerCenter();
            private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$CustomerCenter$1, reason: invalid class name */
            static final class AnonymousClass1 extends s implements a<b<Object>> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // zd.a
                public final b<Object> invoke() {
                    return new x0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]);
                }
            }

            private CustomerCenter() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final b<CustomerCenter> serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class PrivacyPolicy implements Destination {
            private final UrlMethod method;
            private final String urlLid;
            public static final Companion Companion = new Companion(null);
            private static final b<Object>[] $childSerializers = {null, UrlMethod.Companion.serializer()};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<PrivacyPolicy> serializer() {
                    return ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ PrivacyPolicy(int i10, String str, UrlMethod urlMethod, j1 j1Var) {
                if (3 != (i10 & 3)) {
                    z0.a(i10, 3, ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            public PrivacyPolicy(String str, UrlMethod urlMethod) {
                r.f(str, "urlLid");
                r.f(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }

            public static /* synthetic */ PrivacyPolicy copy$default(PrivacyPolicy privacyPolicy, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = privacyPolicy.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = privacyPolicy.method;
                }
                return privacyPolicy.copy(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self(PrivacyPolicy privacyPolicy, d dVar, f fVar) {
                b<Object>[] bVarArr = $childSerializers;
                dVar.w(fVar, 0, privacyPolicy.urlLid);
                dVar.E(fVar, 1, bVarArr[1], privacyPolicy.method);
            }

            public final String component1() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            public final PrivacyPolicy copy(String str, UrlMethod urlMethod) {
                r.f(str, "urlLid");
                r.f(urlMethod, "method");
                return new PrivacyPolicy(str, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrivacyPolicy)) {
                    return false;
                }
                PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
                return r.b(this.urlLid, privacyPolicy.urlLid) && this.method == privacyPolicy.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            public final /* synthetic */ String getUrlLid() {
                return this.urlLid;
            }

            public int hashCode() {
                return (this.urlLid.hashCode() * 31) + this.method.hashCode();
            }

            public String toString() {
                return "PrivacyPolicy(urlLid=" + this.urlLid + ", method=" + this.method + ')';
            }
        }

        public static final class Terms implements Destination {
            private final UrlMethod method;
            private final String urlLid;
            public static final Companion Companion = new Companion(null);
            private static final b<Object>[] $childSerializers = {null, UrlMethod.Companion.serializer()};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Terms> serializer() {
                    return ButtonComponent$Destination$Terms$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Terms(int i10, String str, UrlMethod urlMethod, j1 j1Var) {
                if (3 != (i10 & 3)) {
                    z0.a(i10, 3, ButtonComponent$Destination$Terms$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            public Terms(String str, UrlMethod urlMethod) {
                r.f(str, "urlLid");
                r.f(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }

            public static /* synthetic */ Terms copy$default(Terms terms, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = terms.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = terms.method;
                }
                return terms.copy(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self(Terms terms, d dVar, f fVar) {
                b<Object>[] bVarArr = $childSerializers;
                dVar.w(fVar, 0, terms.urlLid);
                dVar.E(fVar, 1, bVarArr[1], terms.method);
            }

            public final String component1() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            public final Terms copy(String str, UrlMethod urlMethod) {
                r.f(str, "urlLid");
                r.f(urlMethod, "method");
                return new Terms(str, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Terms)) {
                    return false;
                }
                Terms terms = (Terms) obj;
                return r.b(this.urlLid, terms.urlLid) && this.method == terms.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            public final /* synthetic */ String getUrlLid() {
                return this.urlLid;
            }

            public int hashCode() {
                return (this.urlLid.hashCode() * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Terms(urlLid=" + this.urlLid + ", method=" + this.method + ')';
            }
        }

        public static final class Url implements Destination {
            private final UrlMethod method;
            private final String urlLid;
            public static final Companion Companion = new Companion(null);
            private static final b<Object>[] $childSerializers = {null, UrlMethod.Companion.serializer()};

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(j jVar) {
                    this();
                }

                public final b<Url> serializer() {
                    return ButtonComponent$Destination$Url$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Url(int i10, String str, UrlMethod urlMethod, j1 j1Var) {
                if (3 != (i10 & 3)) {
                    z0.a(i10, 3, ButtonComponent$Destination$Url$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            public Url(String str, UrlMethod urlMethod) {
                r.f(str, "urlLid");
                r.f(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }

            public static /* synthetic */ Url copy$default(Url url, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = url.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = url.method;
                }
                return url.copy(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self(Url url, d dVar, f fVar) {
                b<Object>[] bVarArr = $childSerializers;
                dVar.w(fVar, 0, url.urlLid);
                dVar.E(fVar, 1, bVarArr[1], url.method);
            }

            public final String component1() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            public final Url copy(String str, UrlMethod urlMethod) {
                r.f(str, "urlLid");
                r.f(urlMethod, "method");
                return new Url(str, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Url)) {
                    return false;
                }
                Url url = (Url) obj;
                return r.b(this.urlLid, url.urlLid) && this.method == url.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            public final /* synthetic */ String getUrlLid() {
                return this.urlLid;
            }

            public int hashCode() {
                return (this.urlLid.hashCode() * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Url(urlLid=" + this.urlLid + ", method=" + this.method + ')';
            }
        }
    }

    @InternalRevenueCatAPI
    public enum UrlMethod {
        IN_APP_BROWSER,
        EXTERNAL_BROWSER,
        DEEP_LINK;

        public static final Companion Companion = new Companion(null);
        private static final l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, Companion.AnonymousClass1.INSTANCE);

        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$UrlMethod$Companion$1, reason: invalid class name */
            static final class AnonymousClass1 extends s implements a<b<Object>> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // zd.a
                public final b<Object> invoke() {
                    return y.a("com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod", UrlMethod.values(), new String[]{"in_app_browser", "external_browser", "deep_link"}, new Annotation[][]{null, null, null}, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) UrlMethod.$cachedSerializer$delegate.getValue();
            }

            public final b<UrlMethod> serializer() {
                return get$cachedSerializer();
            }
        }
    }

    public /* synthetic */ ButtonComponent(int i10, Action action, StackComponent stackComponent, j1 j1Var) {
        if (3 != (i10 & 3)) {
            z0.a(i10, 3, ButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.action = action;
        this.stack = stackComponent;
    }

    public ButtonComponent(Action action, StackComponent stackComponent) {
        r.f(action, "action");
        r.f(stackComponent, "stack");
        this.action = action;
        this.stack = stackComponent;
    }

    public static final /* synthetic */ void write$Self(ButtonComponent buttonComponent, d dVar, f fVar) {
        dVar.E(fVar, 0, ActionSerializer.INSTANCE, buttonComponent.action);
        dVar.E(fVar, 1, StackComponent$$serializer.INSTANCE, buttonComponent.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) obj;
        return r.b(this.action, buttonComponent.action) && r.b(this.stack, buttonComponent.stack);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + this.stack.hashCode();
    }

    public String toString() {
        return "ButtonComponent(action=" + this.action + ", stack=" + this.stack + ')';
    }
}

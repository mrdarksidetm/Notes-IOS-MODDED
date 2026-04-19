package com.revenuecat.purchases.paywalls.components.properties;

import ae.i0;
import ae.j;
import ae.s;
import af.j1;
import af.x0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import he.c;
import java.lang.annotation.Annotation;
import md.a0;
import md.l;
import md.n;
import md.p;
import we.b;
import we.e;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface SizeConstraint {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b<SizeConstraint> serializer() {
            return new e("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint", i0.b(SizeConstraint.class), new c[]{i0.b(Fill.class), i0.b(Fit.class), i0.b(Fixed.class)}, new b[]{new x0("fill", Fill.INSTANCE, new Annotation[0]), new x0("fit", Fit.INSTANCE, new Annotation[0]), SizeConstraint$Fixed$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    public static final class Fill implements SizeConstraint {
        public static final Fill INSTANCE = new Fill();
        private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements a<b<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // zd.a
            public final b<Object> invoke() {
                return new x0("fill", Fill.INSTANCE, new Annotation[0]);
            }
        }

        private Fill() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final b<Fill> serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Fit implements SizeConstraint {
        public static final Fit INSTANCE = new Fit();
        private static final /* synthetic */ l<b<Object>> $cachedSerializer$delegate = n.a(p.f15570b, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements a<b<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // zd.a
            public final b<Object> invoke() {
                return new x0("fit", Fit.INSTANCE, new Annotation[0]);
            }
        }

        private Fit() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final b<Fit> serializer() {
            return get$cachedSerializer();
        }
    }

    public static final class Fixed implements SizeConstraint {
        public static final Companion Companion = new Companion(null);
        private final int value;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Fixed> serializer() {
                return SizeConstraint$Fixed$$serializer.INSTANCE;
            }
        }

        private Fixed(int i10) {
            this.value = i10;
        }

        public /* synthetic */ Fixed(int i10, j jVar) {
            this(i10);
        }

        private Fixed(int i10, a0 a0Var, j1 j1Var) {
            if (1 != (i10 & 1)) {
                z0.a(i10, 1, SizeConstraint$Fixed$$serializer.INSTANCE.getDescriptor());
            }
            this.value = a0Var.l();
        }

        public /* synthetic */ Fixed(int i10, a0 a0Var, j1 j1Var, j jVar) {
            this(i10, a0Var, j1Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fixed) && this.value == ((Fixed) obj).value;
        }

        /* JADX INFO: renamed from: getValue-pVg5ArA, reason: not valid java name */
        public final /* synthetic */ int m74getValuepVg5ArA() {
            return this.value;
        }

        public int hashCode() {
            return a0.i(this.value);
        }

        public String toString() {
            return "Fixed(value=" + ((Object) a0.j(this.value)) + ')';
        }
    }
}

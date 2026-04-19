package com.revenuecat.purchases.ui.revenuecatui.components.state;

import ae.j;
import ae.r;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Price;
import ie.o;
import java.util.Iterator;
import java.util.List;
import nd.c0;
import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageContext {
    private final k1 selectedPackage$delegate;
    private final k1 variableContext$delegate;

    public static final class VariableContext {
        public static final int $stable = 0;
        private static final Companion Companion = new Companion(null);
        private final Long mostExpensivePricePerMonthMicros;
        private final boolean showZeroDecimalPlacePrices;

        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final Long mostExpensivePricePerMonthMicros(List<Package> list) {
                Object next;
                r.f(list, "<this>");
                Iterator it = o.t(o.s(c0.R(list), PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$1.INSTANCE), PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$2.INSTANCE).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long amountMicros = ((Price) next).getAmountMicros();
                        do {
                            Object next2 = it.next();
                            long amountMicros2 = ((Price) next2).getAmountMicros();
                            if (amountMicros < amountMicros2) {
                                next = next2;
                                amountMicros = amountMicros2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Price price = (Price) next;
                if (price != null) {
                    return Long.valueOf(price.getAmountMicros());
                }
                return null;
            }
        }

        private VariableContext(Long l10, boolean z10) {
            this.mostExpensivePricePerMonthMicros = l10;
            this.showZeroDecimalPlacePrices = z10;
        }

        /* synthetic */ VariableContext(Long l10, boolean z10, int i10, j jVar) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? true : z10);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public VariableContext(List<Package> list, boolean z10) {
            this(Companion.mostExpensivePricePerMonthMicros(list), z10);
            r.f(list, "packages");
        }

        public /* synthetic */ VariableContext(List list, boolean z10, int i10, j jVar) {
            this((List<Package>) list, (i10 & 2) != 0 ? true : z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VariableContext)) {
                return false;
            }
            VariableContext variableContext = (VariableContext) obj;
            return r.b(this.mostExpensivePricePerMonthMicros, variableContext.mostExpensivePricePerMonthMicros) && this.showZeroDecimalPlacePrices == variableContext.showZeroDecimalPlacePrices;
        }

        public final /* synthetic */ Long getMostExpensivePricePerMonthMicros() {
            return this.mostExpensivePricePerMonthMicros;
        }

        public final /* synthetic */ boolean getShowZeroDecimalPlacePrices() {
            return this.showZeroDecimalPlacePrices;
        }

        public int hashCode() {
            Long l10 = this.mostExpensivePricePerMonthMicros;
            return ((l10 == null ? 0 : l10.hashCode()) * 31) + Boolean.hashCode(this.showZeroDecimalPlacePrices);
        }

        public String toString() {
            return "VariableContext(mostExpensivePricePerMonthMicros=" + this.mostExpensivePricePerMonthMicros + ", showZeroDecimalPlacePrices=" + this.showZeroDecimalPlacePrices + ')';
        }
    }

    public PackageContext(Package r32, VariableContext variableContext) {
        r.f(variableContext, "initialVariableContext");
        this.selectedPackage$delegate = k3.e(r32, null, 2, null);
        this.variableContext$delegate = k3.e(variableContext, null, 2, null);
    }

    private final void setSelectedPackage(Package r22) {
        this.selectedPackage$delegate.setValue(r22);
    }

    private final void setVariableContext(VariableContext variableContext) {
        this.variableContext$delegate.setValue(variableContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Package getSelectedPackage() {
        return (Package) this.selectedPackage$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ VariableContext getVariableContext() {
        return (VariableContext) this.variableContext$delegate.getValue();
    }

    public final /* synthetic */ void update(Package r22, VariableContext variableContext) {
        r.f(variableContext, "variableContext");
        setSelectedPackage(r22);
        setVariableContext(variableContext);
    }
}

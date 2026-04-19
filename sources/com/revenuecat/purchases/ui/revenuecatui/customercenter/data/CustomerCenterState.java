package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import ae.j;
import ae.r;
import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CustomerCenterState {

    public static final class Error extends CustomerCenterState {
        public static final int $stable = 8;
        private final PurchasesError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PurchasesError purchasesError) {
            super(null);
            r.f(purchasesError, "error");
            this.error = purchasesError;
        }

        public static /* synthetic */ Error copy$default(Error error, PurchasesError purchasesError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                purchasesError = error.error;
            }
            return error.copy(purchasesError);
        }

        public final PurchasesError component1() {
            return this.error;
        }

        public final Error copy(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            return new Error(purchasesError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && r.b(this.error, ((Error) obj).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    public static final class Loading extends CustomerCenterState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    public static final class Success extends CustomerCenterState {
        public static final int $stable = 0;
        private final String customerCenterConfigDataString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super(null);
            r.f(str, "customerCenterConfigDataString");
            this.customerCenterConfigDataString = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.customerCenterConfigDataString;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.customerCenterConfigDataString;
        }

        public final Success copy(String str) {
            r.f(str, "customerCenterConfigDataString");
            return new Success(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && r.b(this.customerCenterConfigDataString, ((Success) obj).customerCenterConfigDataString);
        }

        public final String getCustomerCenterConfigDataString() {
            return this.customerCenterConfigDataString;
        }

        public int hashCode() {
            return this.customerCenterConfigDataString.hashCode();
        }

        public String toString() {
            return "Success(customerCenterConfigDataString=" + this.customerCenterConfigDataString + ')';
        }
    }

    private CustomerCenterState() {
    }

    public /* synthetic */ CustomerCenterState(j jVar) {
        this();
    }
}

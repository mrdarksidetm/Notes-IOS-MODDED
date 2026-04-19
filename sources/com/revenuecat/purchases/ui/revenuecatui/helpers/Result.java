package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Result<A, B> {

    public static final class Error<B> extends Result {
        public static final int $stable = 0;
        private final B value;

        public Error(B b10) {
            super(null);
            this.value = b10;
        }

        public final B getValue() {
            return this.value;
        }
    }

    public static final class Success<A> extends Result {
        public static final int $stable = 0;
        private final A value;

        public Success(A a10) {
            super(null);
            this.value = a10;
        }

        public final A getValue() {
            return this.value;
        }
    }

    private Result() {
    }

    public /* synthetic */ Result(j jVar) {
        this();
    }
}

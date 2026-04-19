package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f8112a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f8113a = new HashSet();

        public a a(int i10) {
            this.f8113a.add(Integer.valueOf(i10));
            return this;
        }

        public f b() {
            return new f(this.f8113a, null);
        }
    }

    /* synthetic */ f(Set set, v6.j0 j0Var) {
        this.f8112a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    final ArrayList b() {
        return this.f8112a;
    }
}

package com.revenuecat.purchases.utils;

import ae.j;
import ae.r;
import java.util.Date;
import ke.a;
import ke.c;
import ke.d;

/* JADX INFO: loaded from: classes2.dex */
public final class DateHelper {
    public static final Companion Companion = new Companion(null);
    private static final long ENTITLEMENT_GRACE_PERIOD;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA$default, reason: not valid java name */
        public static /* synthetic */ DateActive m283isDateActiveSxA4cEA$default(Companion companion, Date date, Date date2, long j10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                j10 = DateHelper.ENTITLEMENT_GRACE_PERIOD;
            }
            return companion.m284isDateActiveSxA4cEA(date, date2, j10);
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA, reason: not valid java name */
        public final DateActive m284isDateActiveSxA4cEA(Date date, Date date2, long j10) {
            r.f(date2, "requestDate");
            if (date == null) {
                return new DateActive(true, true);
            }
            boolean z10 = new Date().getTime() - date2.getTime() <= a.t(j10);
            if (!z10) {
                date2 = new Date();
            }
            return new DateActive(date.after(date2), z10);
        }
    }

    static {
        a.C0337a c0337a = a.f14459b;
        ENTITLEMENT_GRACE_PERIOD = c.s(3, d.f14472h);
    }

    private DateHelper() {
    }
}

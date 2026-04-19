package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.r;
import l1.j0;
import l1.z;

/* JADX INFO: loaded from: classes2.dex */
public interface ColorStyle {

    public static final class Gradient implements ColorStyle {
        private final /* synthetic */ z brush;

        private /* synthetic */ Gradient(z zVar) {
            this.brush = zVar;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Gradient m110boximpl(z zVar) {
            return new Gradient(zVar);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static z m111constructorimpl(z zVar) {
            r.f(zVar, "brush");
            return zVar;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m112equalsimpl(z zVar, Object obj) {
            return (obj instanceof Gradient) && r.b(zVar, ((Gradient) obj).m116unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m113equalsimpl0(z zVar, z zVar2) {
            return r.b(zVar, zVar2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m114hashCodeimpl(z zVar) {
            return zVar.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m115toStringimpl(z zVar) {
            return "Gradient(brush=" + zVar + ')';
        }

        public boolean equals(Object obj) {
            return m112equalsimpl(this.brush, obj);
        }

        public final z getBrush() {
            return this.brush;
        }

        public int hashCode() {
            return m114hashCodeimpl(this.brush);
        }

        public String toString() {
            return m115toStringimpl(this.brush);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ z m116unboximpl() {
            return this.brush;
        }
    }

    public static final class Solid implements ColorStyle {
        private final /* synthetic */ long color;

        private /* synthetic */ Solid(long j10) {
            this.color = j10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Solid m117boximpl(long j10) {
            return new Solid(j10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m118constructorimpl(long j10) {
            return j10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m119equalsimpl(long j10, Object obj) {
            return (obj instanceof Solid) && j0.w(j10, ((Solid) obj).m124unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m120equalsimpl0(long j10, long j11) {
            return j0.w(j10, j11);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m121hashCodeimpl(long j10) {
            return j0.C(j10);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m122toStringimpl(long j10) {
            return "Solid(color=" + ((Object) j0.D(j10)) + ')';
        }

        public boolean equals(Object obj) {
            return m119equalsimpl(this.color, obj);
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m123getColor0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            return m121hashCodeimpl(this.color);
        }

        public String toString() {
            return m122toStringimpl(this.color);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m124unboximpl() {
            return this.color;
        }
    }
}

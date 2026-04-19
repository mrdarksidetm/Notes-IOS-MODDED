package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.r;
import o1.c;

/* JADX INFO: loaded from: classes2.dex */
public interface BackgroundStyle {

    public static final class Color implements BackgroundStyle {
        private final /* synthetic */ ColorStyle color;

        private /* synthetic */ Color(ColorStyle colorStyle) {
            this.color = colorStyle;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Color m92boximpl(ColorStyle colorStyle) {
            return new Color(colorStyle);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ColorStyle m93constructorimpl(ColorStyle colorStyle) {
            r.f(colorStyle, "color");
            return colorStyle;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m94equalsimpl(ColorStyle colorStyle, Object obj) {
            return (obj instanceof Color) && r.b(colorStyle, ((Color) obj).m98unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m95equalsimpl0(ColorStyle colorStyle, ColorStyle colorStyle2) {
            return r.b(colorStyle, colorStyle2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m96hashCodeimpl(ColorStyle colorStyle) {
            return colorStyle.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m97toStringimpl(ColorStyle colorStyle) {
            return "Color(color=" + colorStyle + ')';
        }

        public boolean equals(Object obj) {
            return m94equalsimpl(this.color, obj);
        }

        public final ColorStyle getColor() {
            return this.color;
        }

        public int hashCode() {
            return m96hashCodeimpl(this.color);
        }

        public String toString() {
            return m97toStringimpl(this.color);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ColorStyle m98unboximpl() {
            return this.color;
        }
    }

    public static final class Image implements BackgroundStyle {
        private final /* synthetic */ c painter;

        private /* synthetic */ Image(c cVar) {
            this.painter = cVar;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Image m99boximpl(c cVar) {
            return new Image(cVar);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static c m100constructorimpl(c cVar) {
            r.f(cVar, "painter");
            return cVar;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m101equalsimpl(c cVar, Object obj) {
            return (obj instanceof Image) && r.b(cVar, ((Image) obj).m105unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m102equalsimpl0(c cVar, c cVar2) {
            return r.b(cVar, cVar2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m103hashCodeimpl(c cVar) {
            return cVar.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m104toStringimpl(c cVar) {
            return "Image(painter=" + cVar + ')';
        }

        public boolean equals(Object obj) {
            return m101equalsimpl(this.painter, obj);
        }

        public final c getPainter() {
            return this.painter;
        }

        public int hashCode() {
            return m103hashCodeimpl(this.painter);
        }

        public String toString() {
            return m104toStringimpl(this.painter);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ c m105unboximpl() {
            return this.painter;
        }
    }
}

package f3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class e {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f11102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f11103b;

        a(int i10, int i11) {
            this.f11102a = new int[]{i10, i11};
            this.f11103b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f11102a = new int[]{i10, i11, i12};
            this.f11103b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f11102a = new int[size];
            this.f11103b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f11102a[i10] = list.get(i10).intValue();
                this.f11103b[i10] = list2.get(i10).floatValue();
            }
        }
    }

    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayQ = j.q(resources, theme, attributeSet, c3.f.A);
        float fJ = j.j(typedArrayQ, xmlPullParser, "startX", c3.f.J, 0.0f);
        float fJ2 = j.j(typedArrayQ, xmlPullParser, "startY", c3.f.K, 0.0f);
        float fJ3 = j.j(typedArrayQ, xmlPullParser, "endX", c3.f.L, 0.0f);
        float fJ4 = j.j(typedArrayQ, xmlPullParser, "endY", c3.f.M, 0.0f);
        float fJ5 = j.j(typedArrayQ, xmlPullParser, "centerX", c3.f.E, 0.0f);
        float fJ6 = j.j(typedArrayQ, xmlPullParser, "centerY", c3.f.F, 0.0f);
        int iK = j.k(typedArrayQ, xmlPullParser, "type", c3.f.D, 0);
        int iF = j.f(typedArrayQ, xmlPullParser, "startColor", c3.f.B, 0);
        boolean zP = j.p(xmlPullParser, "centerColor");
        int iF2 = j.f(typedArrayQ, xmlPullParser, "centerColor", c3.f.I, 0);
        int iF3 = j.f(typedArrayQ, xmlPullParser, "endColor", c3.f.C, 0);
        int iK2 = j.k(typedArrayQ, xmlPullParser, "tileMode", c3.f.H, 0);
        float fJ7 = j.j(typedArrayQ, xmlPullParser, "gradientRadius", c3.f.G, 0.0f);
        typedArrayQ.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zP, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f11102a, aVarA.f11103b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f11102a, aVarA.f11103b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f11102a, aVarA.f11103b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new f3.e.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static f3.e.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = c3.f.N
            android.content.res.TypedArray r3 = f3.j.q(r9, r12, r11, r3)
            int r5 = c3.f.O
            boolean r6 = r3.hasValue(r5)
            int r7 = c3.f.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            f3.e$a r9 = new f3.e$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.e.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):f3.e$a");
    }

    private static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}

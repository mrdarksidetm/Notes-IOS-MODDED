package q1;

import ae.r;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import f3.d;
import f3.j;
import java.io.IOException;
import java.util.List;
import l1.a0;
import l1.h1;
import l1.l0;
import l1.u1;
import l1.v1;
import l1.w1;
import l1.z;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p1.d;
import p1.h;
import p1.o;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f18967a = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p1.d.a a(q1.a r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.c.a(q1.a, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet):p1.d$a");
    }

    private static final int b(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : v1.f14620a.c() : v1.f14620a.b() : v1.f14620a.a();
    }

    private static final int c(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : w1.f14633a.a() : w1.f14633a.c() : w1.f14633a.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final z e(d dVar) {
        if (!dVar.i()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? a0.a(shaderF) : new u1(l0.b(dVar.e()), null);
    }

    public static final void f(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar2) {
        b bVar = b.f18941a;
        TypedArray typedArrayK = aVar.k(resources, theme, attributeSet, bVar.b());
        String strI = aVar.i(typedArrayK, bVar.c());
        if (strI == null) {
            strI = "";
        }
        List<h> listA = o.a(aVar.i(typedArrayK, bVar.d()));
        typedArrayK.recycle();
        aVar2.a((254 & 1) != 0 ? "" : strI, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & 128) == 0 ? 0.0f : 0.0f, (254 & 256) != 0 ? o.e() : listA);
    }

    public static final int g(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, d.a aVar2, int i10) throws XmlPullParserException {
        int eventType = aVar.j().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !r.b("group", aVar.j().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar2.g();
            }
            return 0;
        }
        String name = aVar.j().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i10;
            }
            f(aVar, resources, theme, attributeSet, aVar2);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            i(aVar, resources, theme, attributeSet, aVar2);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        h(aVar, resources, theme, attributeSet, aVar2);
        return i10;
    }

    public static final void h(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar2) {
        b bVar = b.f18941a;
        TypedArray typedArrayK = aVar.k(resources, theme, attributeSet, bVar.e());
        float fG = aVar.g(typedArrayK, "rotation", bVar.i(), 0.0f);
        float fB = aVar.b(typedArrayK, bVar.g(), 0.0f);
        float fB2 = aVar.b(typedArrayK, bVar.h(), 0.0f);
        float fG2 = aVar.g(typedArrayK, "scaleX", bVar.j(), 1.0f);
        float fG3 = aVar.g(typedArrayK, "scaleY", bVar.k(), 1.0f);
        float fG4 = aVar.g(typedArrayK, "translateX", bVar.l(), 0.0f);
        float fG5 = aVar.g(typedArrayK, "translateY", bVar.m(), 0.0f);
        String strI = aVar.i(typedArrayK, bVar.f());
        if (strI == null) {
            strI = "";
        }
        typedArrayK.recycle();
        aVar2.a(strI, fG, fB, fB2, fG2, fG3, fG4, fG5, o.e());
    }

    public static final void i(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar2) {
        b bVar = b.f18941a;
        TypedArray typedArrayK = aVar.k(resources, theme, attributeSet, bVar.o());
        if (!j.p(aVar.j(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strI = aVar.i(typedArrayK, bVar.r());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        List<h> listA = o.a(aVar.i(typedArrayK, bVar.s()));
        f3.d dVarF = aVar.f(typedArrayK, theme, "fillColor", bVar.q(), 0);
        float fG = aVar.g(typedArrayK, "fillAlpha", bVar.p(), 1.0f);
        int iB = b(aVar.h(typedArrayK, "strokeLineCap", bVar.v(), -1), v1.f14620a.a());
        int iC = c(aVar.h(typedArrayK, "strokeLineJoin", bVar.w(), -1), w1.f14633a.a());
        float fG2 = aVar.g(typedArrayK, "strokeMiterLimit", bVar.x(), 1.0f);
        f3.d dVarF2 = aVar.f(typedArrayK, theme, "strokeColor", bVar.u(), 0);
        float fG3 = aVar.g(typedArrayK, "strokeAlpha", bVar.t(), 1.0f);
        float fG4 = aVar.g(typedArrayK, "strokeWidth", bVar.y(), 1.0f);
        float fG5 = aVar.g(typedArrayK, "trimPathEnd", bVar.z(), 1.0f);
        float fG6 = aVar.g(typedArrayK, "trimPathOffset", bVar.B(), 0.0f);
        float fG7 = aVar.g(typedArrayK, "trimPathStart", bVar.C(), 0.0f);
        int iH = aVar.h(typedArrayK, "fillType", bVar.A(), f18967a);
        typedArrayK.recycle();
        z zVarE = e(dVarF);
        z zVarE2 = e(dVarF2);
        h1.a aVar3 = h1.f14510a;
        aVar2.c(listA, iH == 0 ? aVar3.b() : aVar3.a(), str, zVarE, fG, zVarE2, fG3, fG4, iB, iC, fG2, fG7, fG5, fG6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}

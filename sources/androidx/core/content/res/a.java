package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import c3.f;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: androidx.core.content.res.a$a, reason: collision with other inner class name */
    static class C0073a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f3285a;

        public c(d[] dVarArr) {
            this.f3285a = dVarArr;
        }

        public d[] a() {
            return this.f3285a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f3288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f3289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f3290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f3291f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f3286a = str;
            this.f3287b = i10;
            this.f3288c = z10;
            this.f3289d = str2;
            this.f3290e = i11;
            this.f3291f = i12;
        }

        public String a() {
            return this.f3286a;
        }

        public int b() {
            return this.f3291f;
        }

        public int c() {
            return this.f3290e;
        }

        public String d() {
            return this.f3289d;
        }

        public int e() {
            return this.f3287b;
        }

        public boolean f() {
            return this.f3288c;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l3.e f3292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f3295d;

        public e(l3.e eVar, int i10, int i11, String str) {
            this.f3292a = eVar;
            this.f3294c = i10;
            this.f3293b = i11;
            this.f3295d = str;
        }

        public int a() {
            return this.f3294c;
        }

        public l3.e b() {
            return this.f3292a;
        }

        public String c() {
            return this.f3295d;
        }

        public int d() {
            return this.f3293b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return C0073a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), f.f6359h);
        String string = typedArrayObtainAttributes.getString(f.f6360i);
        String string2 = typedArrayObtainAttributes.getString(f.f6364m);
        String string3 = typedArrayObtainAttributes.getString(f.f6365n);
        int resourceId = typedArrayObtainAttributes.getResourceId(f.f6361j, 0);
        int integer = typedArrayObtainAttributes.getInteger(f.f6362k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(f.f6363l, 500);
        String string4 = typedArrayObtainAttributes.getString(f.f6366o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new l3.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), f.f6367p);
        int i10 = f.f6376y;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = f.f6369r;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, RCHTTPStatusCodes.BAD_REQUEST);
        int i12 = f.f6374w;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = f.f6370s;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = f.f6377z;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = f.f6371t;
        }
        int i14 = f.f6375x;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = f.f6372u;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = f.f6373v;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = f.f6368q;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}

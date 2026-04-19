package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.r0;
import j.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class f extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class<?>[] f17717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class<?>[] f17718f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f17719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f17720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f17721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f17722d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f17723c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f17724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f17725b;

        public a(Object obj, String str) {
            this.f17724a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f17725b = cls.getMethod(str, f17723c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f17725b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f17725b.invoke(this.f17724a, menuItem)).booleanValue();
                }
                this.f17725b.invoke(this.f17724a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {
        o3.a A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f17726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f17732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f17733h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f17734i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f17735j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f17736k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f17737l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f17738m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f17739n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f17740o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f17741p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f17742q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f17743r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f17744s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f17745t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f17746u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f17747v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f17748w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f17749x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f17750y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f17751z;

        public b(Menu menu) {
            this.f17726a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f17721c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f17744s).setVisible(this.f17745t).setEnabled(this.f17746u).setCheckable(this.f17743r >= 1).setTitleCondensed(this.f17737l).setIcon(this.f17738m);
            int i10 = this.f17747v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f17751z != null) {
                if (f.this.f17721c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(f.this.b(), this.f17751z));
            }
            if (this.f17743r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof q.c) {
                    ((q.c) menuItem).h(true);
                }
            }
            String str = this.f17749x;
            if (str != null) {
                menuItem.setActionView((View) e(str, f.f17717e, f.this.f17719a));
                z10 = true;
            }
            int i11 = this.f17748w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            o3.a aVar = this.A;
            if (aVar != null) {
                androidx.core.view.d.a(menuItem, aVar);
            }
            androidx.core.view.d.c(menuItem, this.B);
            androidx.core.view.d.g(menuItem, this.C);
            androidx.core.view.d.b(menuItem, this.f17739n, this.f17740o);
            androidx.core.view.d.f(menuItem, this.f17741p, this.f17742q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                androidx.core.view.d.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                androidx.core.view.d.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f17733h = true;
            i(this.f17726a.add(this.f17727b, this.f17734i, this.f17735j, this.f17736k));
        }

        public SubMenu b() {
            this.f17733h = true;
            SubMenu subMenuAddSubMenu = this.f17726a.addSubMenu(this.f17727b, this.f17734i, this.f17735j, this.f17736k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f17733h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = f.this.f17721c.obtainStyledAttributes(attributeSet, j.f13544o1);
            this.f17727b = typedArrayObtainStyledAttributes.getResourceId(j.f13554q1, 0);
            this.f17728c = typedArrayObtainStyledAttributes.getInt(j.f13564s1, 0);
            this.f17729d = typedArrayObtainStyledAttributes.getInt(j.f13569t1, 0);
            this.f17730e = typedArrayObtainStyledAttributes.getInt(j.f13574u1, 0);
            this.f17731f = typedArrayObtainStyledAttributes.getBoolean(j.f13559r1, true);
            this.f17732g = typedArrayObtainStyledAttributes.getBoolean(j.f13549p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            r0 r0VarT = r0.t(f.this.f17721c, attributeSet, j.f13579v1);
            this.f17734i = r0VarT.m(j.f13594y1, 0);
            this.f17735j = (r0VarT.j(j.B1, this.f17728c) & (-65536)) | (r0VarT.j(j.C1, this.f17729d) & 65535);
            this.f17736k = r0VarT.o(j.D1);
            this.f17737l = r0VarT.o(j.E1);
            this.f17738m = r0VarT.m(j.f13584w1, 0);
            this.f17739n = c(r0VarT.n(j.F1));
            this.f17740o = r0VarT.j(j.M1, 4096);
            this.f17741p = c(r0VarT.n(j.G1));
            this.f17742q = r0VarT.j(j.Q1, 4096);
            int i10 = j.H1;
            this.f17743r = r0VarT.r(i10) ? r0VarT.a(i10, false) : this.f17730e;
            this.f17744s = r0VarT.a(j.f13599z1, false);
            this.f17745t = r0VarT.a(j.A1, this.f17731f);
            this.f17746u = r0VarT.a(j.f13589x1, this.f17732g);
            this.f17747v = r0VarT.j(j.R1, -1);
            this.f17751z = r0VarT.n(j.I1);
            this.f17748w = r0VarT.m(j.J1, 0);
            this.f17749x = r0VarT.n(j.L1);
            String strN = r0VarT.n(j.K1);
            this.f17750y = strN;
            boolean z10 = strN != null;
            if (z10 && this.f17748w == 0 && this.f17749x == null) {
                this.A = (o3.a) e(strN, f.f17718f, f.this.f17720b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = r0VarT.o(j.N1);
            this.C = r0VarT.o(j.S1);
            int i11 = j.P1;
            if (r0VarT.r(i11)) {
                this.E = c0.e(r0VarT.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.O1;
            if (r0VarT.r(i12)) {
                this.D = r0VarT.c(i12);
            } else {
                this.D = null;
            }
            r0VarT.v();
            this.f17733h = false;
        }

        public void h() {
            this.f17727b = 0;
            this.f17728c = 0;
            this.f17729d = 0;
            this.f17730e = 0;
            this.f17731f = true;
            this.f17732g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f17717e = clsArr;
        f17718f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f17721c = context;
        Object[] objArr = {context};
        this.f17719a = objArr;
        this.f17720b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            o3.a aVar = bVar.A;
                            if (aVar == null || !aVar.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f17722d == null) {
            this.f17722d = a(this.f17721c);
        }
        return this.f17722d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof i3.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f17721c.getResources().getLayout(i10);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}

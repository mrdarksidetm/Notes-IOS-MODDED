package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import o3.a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i3.b {
    private View A;
    private o3.a B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f1268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f1269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f1270h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f1272j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1274l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f1276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f1277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f1278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f1280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f1281s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1288z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1271i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1273k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1275m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f1282t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f1283u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1284v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1285w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1286x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1287y = 16;
    private boolean D = false;

    class a implements a.b {
        a() {
        }

        @Override // o3.a.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f1276n.J(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1276n = eVar;
        this.f1263a = i11;
        this.f1264b = i10;
        this.f1265c = i12;
        this.f1266d = i13;
        this.f1267e = charSequence;
        this.f1288z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1286x && (this.f1284v || this.f1285w)) {
            drawable = androidx.core.graphics.drawable.a.j(drawable).mutate();
            if (this.f1284v) {
                androidx.core.graphics.drawable.a.g(drawable, this.f1282t);
            }
            if (this.f1285w) {
                androidx.core.graphics.drawable.a.h(drawable, this.f1283u);
            }
            this.f1286x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f1276n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f1288z & 4) == 4;
    }

    @Override // i3.b
    public i3.b a(o3.a aVar) {
        o3.a aVar2 = this.B;
        if (aVar2 != null) {
            aVar2.h();
        }
        this.A = null;
        this.B = aVar;
        this.f1276n.K(true);
        o3.a aVar3 = this.B;
        if (aVar3 != null) {
            aVar3.j(new a());
        }
        return this;
    }

    @Override // i3.b
    public o3.a b() {
        return this.B;
    }

    public void c() {
        this.f1276n.I(this);
    }

    @Override // i3.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1288z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1276n.f(this);
        }
        return false;
    }

    @Override // i3.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1276n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f1266d;
    }

    char g() {
        return this.f1276n.G() ? this.f1272j : this.f1270h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // i3.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        o3.a aVar = this.B;
        if (aVar == null) {
            return null;
        }
        View viewD = aVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // i3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1273k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1272j;
    }

    @Override // i3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1280r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1264b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1274l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1275m == 0) {
            return null;
        }
        Drawable drawableB = l.a.b(this.f1276n.u(), this.f1275m);
        this.f1275m = 0;
        this.f1274l = drawableB;
        return e(drawableB);
    }

    @Override // i3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1282t;
    }

    @Override // i3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1283u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1269g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1263a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // i3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1271i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1270h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1265c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1277o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1267e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1268f;
        return charSequence != null ? charSequence : this.f1267e;
    }

    @Override // i3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1281s;
    }

    String h() {
        int i10;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f1276n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1276n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(j.h.f13465m));
        }
        int i11 = this.f1276n.G() ? this.f1273k : this.f1271i;
        d(sb2, i11, 65536, resources.getString(j.h.f13461i));
        d(sb2, i11, 4096, resources.getString(j.h.f13457e));
        d(sb2, i11, 2, resources.getString(j.h.f13456d));
        d(sb2, i11, 1, resources.getString(j.h.f13462j));
        d(sb2, i11, 4, resources.getString(j.h.f13464l));
        d(sb2, i11, 8, resources.getString(j.h.f13460h));
        if (cG == '\b') {
            i10 = j.h.f13458f;
        } else if (cG == '\n') {
            i10 = j.h.f13459g;
        } else {
            if (cG != ' ') {
                sb2.append(cG);
                return sb2.toString();
            }
            i10 = j.h.f13463k;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1277o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // i3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1287y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1287y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1287y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        o3.a aVar = this.B;
        return (aVar == null || !aVar.g()) ? (this.f1287y & 8) == 0 : (this.f1287y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        o3.a aVar;
        if ((this.f1288z & 8) == 0) {
            return false;
        }
        if (this.A == null && (aVar = this.B) != null) {
            this.A = aVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1279q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f1276n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f1278p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1269g != null) {
            try {
                this.f1276n.u().startActivity(this.f1269g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        o3.a aVar = this.B;
        return aVar != null && aVar.e();
    }

    public boolean l() {
        return (this.f1287y & 32) == 32;
    }

    public boolean m() {
        return (this.f1287y & 4) != 0;
    }

    public boolean n() {
        return (this.f1288z & 1) == 1;
    }

    public boolean o() {
        return (this.f1288z & 2) == 2;
    }

    @Override // i3.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public i3.b setActionView(int i10) {
        Context contextU = this.f1276n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i10, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public i3.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1263a) > 0) {
            view.setId(i10);
        }
        this.f1276n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1276n.K(false);
    }

    void s(boolean z10) {
        int i10 = this.f1287y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1287y = i11;
        if (i10 != i11) {
            this.f1276n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1272j == c10) {
            return this;
        }
        this.f1272j = Character.toLowerCase(c10);
        this.f1276n.K(false);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1272j == c10 && this.f1273k == i10) {
            return this;
        }
        this.f1272j = Character.toLowerCase(c10);
        this.f1273k = KeyEvent.normalizeMetaState(i10);
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1287y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1287y = i11;
        if (i10 != i11) {
            this.f1276n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1287y & 4) != 0) {
            this.f1276n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public i3.b setContentDescription(CharSequence charSequence) {
        this.f1280r = charSequence;
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1287y = z10 ? this.f1287y | 16 : this.f1287y & (-17);
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1274l = null;
        this.f1275m = i10;
        this.f1286x = true;
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1275m = 0;
        this.f1274l = drawable;
        this.f1286x = true;
        this.f1276n.K(false);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1282t = colorStateList;
        this.f1284v = true;
        this.f1286x = true;
        this.f1276n.K(false);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1283u = mode;
        this.f1285w = true;
        this.f1286x = true;
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1269g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1270h == c10) {
            return this;
        }
        this.f1270h = c10;
        this.f1276n.K(false);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1270h == c10 && this.f1271i == i10) {
            return this;
        }
        this.f1270h = c10;
        this.f1271i = KeyEvent.normalizeMetaState(i10);
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1279q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1270h = c10;
        this.f1272j = Character.toLowerCase(c11);
        this.f1276n.K(false);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1270h = c10;
        this.f1271i = KeyEvent.normalizeMetaState(i10);
        this.f1272j = Character.toLowerCase(c11);
        this.f1273k = KeyEvent.normalizeMetaState(i11);
        this.f1276n.K(false);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1288z = i10;
        this.f1276n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1276n.u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1267e = charSequence;
        this.f1276n.K(false);
        m mVar = this.f1277o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1268f = charSequence;
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public i3.b setTooltipText(CharSequence charSequence) {
        this.f1281s = charSequence;
        this.f1276n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1276n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1287y = (z10 ? 4 : 0) | (this.f1287y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1267e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f1287y = z10 ? this.f1287y | 32 : this.f1287y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // i3.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public i3.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f1277o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f1287y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1287y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f1276n.A();
    }
}

package q;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a implements i3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f18382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f18383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f18384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f18385g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f18387i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f18389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f18390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f18391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f18392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f18393o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18386h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18388j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f18394p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f18395q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18396r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18397s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18398t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f18390l = context;
        this.f18379a = i11;
        this.f18380b = i10;
        this.f18381c = i13;
        this.f18382d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f18389k;
        if (drawable != null) {
            if (this.f18396r || this.f18397s) {
                Drawable drawableJ = androidx.core.graphics.drawable.a.j(drawable);
                this.f18389k = drawableJ;
                Drawable drawableMutate = drawableJ.mutate();
                this.f18389k = drawableMutate;
                if (this.f18396r) {
                    androidx.core.graphics.drawable.a.g(drawableMutate, this.f18394p);
                }
                if (this.f18397s) {
                    androidx.core.graphics.drawable.a.h(this.f18389k, this.f18395q);
                }
            }
        }
    }

    @Override // i3.b
    public i3.b a(o3.a aVar) {
        throw new UnsupportedOperationException();
    }

    @Override // i3.b
    public o3.a b() {
        return null;
    }

    @Override // i3.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // i3.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i3.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // i3.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i3.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // i3.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // i3.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i3.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // i3.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // i3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f18388j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f18387i;
    }

    @Override // i3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f18392n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f18380b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f18389k;
    }

    @Override // i3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f18394p;
    }

    @Override // i3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f18395q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f18384f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f18379a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // i3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f18386h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f18385g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f18381c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f18382d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18383e;
        return charSequence != null ? charSequence : this.f18382d;
    }

    @Override // i3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f18393o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // i3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f18398t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f18398t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f18398t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f18398t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f18387i = Character.toLowerCase(c10);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f18387i = Character.toLowerCase(c10);
        this.f18388j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f18398t = (z10 ? 1 : 0) | (this.f18398t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f18398t = (z10 ? 2 : 0) | (this.f18398t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public i3.b setContentDescription(CharSequence charSequence) {
        this.f18392n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f18398t = (z10 ? 16 : 0) | (this.f18398t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f18389k = androidx.core.content.a.getDrawable(this.f18390l, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f18389k = drawable;
        c();
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18394p = colorStateList;
        this.f18396r = true;
        c();
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18395q = mode;
        this.f18397s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f18384f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f18385g = c10;
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f18385g = c10;
        this.f18386h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18391m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f18385g = c10;
        this.f18387i = Character.toLowerCase(c11);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f18385g = c10;
        this.f18386h = KeyEvent.normalizeMetaState(i10);
        this.f18387i = Character.toLowerCase(c11);
        this.f18388j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // i3.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f18382d = this.f18390l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f18382d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18383e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public i3.b setTooltipText(CharSequence charSequence) {
        this.f18393o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f18398t = (this.f18398t & 8) | (z10 ? 0 : 8);
        return this;
    }
}

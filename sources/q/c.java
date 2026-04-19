package q;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import o3.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends q.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i3.b f18402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f18403e;

    private class a extends o3.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ActionProvider f18404d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f18404d = actionProvider;
        }

        @Override // o3.a
        public boolean a() {
            return this.f18404d.hasSubMenu();
        }

        @Override // o3.a
        public View c() {
            return this.f18404d.onCreateActionView();
        }

        @Override // o3.a
        public boolean e() {
            return this.f18404d.onPerformDefaultAction();
        }

        @Override // o3.a
        public void f(SubMenu subMenu) {
            this.f18404d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private a.b f18406f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // o3.a
        public boolean b() {
            return this.f18404d.isVisible();
        }

        @Override // o3.a
        public View d(MenuItem menuItem) {
            return this.f18404d.onCreateActionView(menuItem);
        }

        @Override // o3.a
        public boolean g() {
            return this.f18404d.overridesItemVisibility();
        }

        @Override // o3.a
        public void j(a.b bVar) {
            this.f18406f = bVar;
            this.f18404d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            a.b bVar = this.f18406f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX INFO: renamed from: q.c$c, reason: collision with other inner class name */
    static class C0387c extends FrameLayout implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f18408a;

        /* JADX WARN: Multi-variable type inference failed */
        C0387c(View view) {
            super(view.getContext());
            this.f18408a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f18408a;
        }

        @Override // p.c
        public void onActionViewCollapsed() {
            this.f18408a.onActionViewCollapsed();
        }

        @Override // p.c
        public void onActionViewExpanded() {
            this.f18408a.onActionViewExpanded();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f18409a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f18409a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f18409a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f18409a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f18411a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f18411a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f18411a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, i3.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f18402d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f18402d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f18402d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        o3.a aVarB = this.f18402d.b();
        if (aVarB instanceof a) {
            return ((a) aVarB).f18404d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f18402d.getActionView();
        return actionView instanceof C0387c ? ((C0387c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f18402d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f18402d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f18402d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f18402d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f18402d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f18402d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f18402d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f18402d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f18402d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f18402d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f18402d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f18402d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f18402d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f18402d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f18402d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f18402d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f18402d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f18403e == null) {
                this.f18403e = this.f18402d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f18403e.invoke(this.f18402d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f18402d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f18402d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f18402d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f18402d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f18402d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f18402d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f18399a, actionProvider);
        i3.b bVar2 = this.f18402d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f18402d.setActionView(i10);
        View actionView = this.f18402d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f18402d.setActionView(new C0387c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0387c(view);
        }
        this.f18402d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f18402d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f18402d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f18402d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f18402d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f18402d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f18402d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f18402d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f18402d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18402d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18402d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f18402d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f18402d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f18402d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f18402d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18402d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f18402d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f18402d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f18402d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f18402d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f18402d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f18402d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18402d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f18402d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f18402d.setVisible(z10);
    }
}

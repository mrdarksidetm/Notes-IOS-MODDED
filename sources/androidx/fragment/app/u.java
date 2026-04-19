package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class u implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w f4234a;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f4235a;

        a(b0 b0Var) {
            this.f4235a = b0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            n nVarK = this.f4235a.k();
            this.f4235a.m();
            l0.u((ViewGroup) nVarK.mView.getParent(), u.this.f4234a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    u(w wVar) {
        this.f4234a = wVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        b0 b0VarW;
        StringBuilder sb2;
        String str2;
        if (q.class.getName().equals(str)) {
            return new q(context, attributeSet, this.f4234a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.c.f13912a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(j4.c.f13913b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j4.c.f13914c, -1);
        String string = typedArrayObtainStyledAttributes.getString(j4.c.f13915d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !s.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        n nVarI0 = resourceId != -1 ? this.f4234a.i0(resourceId) : null;
        if (nVarI0 == null && string != null) {
            nVarI0 = this.f4234a.j0(string);
        }
        if (nVarI0 == null && id2 != -1) {
            nVarI0 = this.f4234a.i0(id2);
        }
        if (nVarI0 == null) {
            nVarI0 = this.f4234a.u0().a(context.getClassLoader(), attributeValue);
            nVarI0.mFromLayout = true;
            nVarI0.mFragmentId = resourceId != 0 ? resourceId : id2;
            nVarI0.mContainerId = id2;
            nVarI0.mTag = string;
            nVarI0.mInLayout = true;
            w wVar = this.f4234a;
            nVarI0.mFragmentManager = wVar;
            nVarI0.mHost = wVar.w0();
            nVarI0.onInflate(this.f4234a.w0().f(), attributeSet, nVarI0.mSavedFragmentState);
            b0VarW = this.f4234a.i(nVarI0);
            if (w.J0(2)) {
                sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(nVarI0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb2.append(str2);
                sb2.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb2.toString());
            }
        } else {
            if (nVarI0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            nVarI0.mInLayout = true;
            w wVar2 = this.f4234a;
            nVarI0.mFragmentManager = wVar2;
            nVarI0.mHost = wVar2.w0();
            nVarI0.onInflate(this.f4234a.w0().f(), attributeSet, nVarI0.mSavedFragmentState);
            b0VarW = this.f4234a.w(nVarI0);
            if (w.J0(2)) {
                sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(nVarI0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb2.append(str2);
                sb2.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        l4.d.i(nVarI0, viewGroup);
        nVarI0.mContainer = viewGroup;
        b0VarW.m();
        b0VarW.j();
        View view2 = nVarI0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (nVarI0.mView.getTag() == null) {
            nVarI0.mView.setTag(string);
        }
        nVarI0.mView.addOnAttachStateChangeListener(new a(b0VarW));
        return nVarI0.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

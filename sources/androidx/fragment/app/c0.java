package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<n> f3985a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, b0> f3986b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f3987c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z f3988d;

    c0() {
    }

    void A(z zVar) {
        this.f3988d = zVar;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? this.f3987c.put(str, bundle) : this.f3987c.remove(str);
    }

    void a(n nVar) {
        if (this.f3985a.contains(nVar)) {
            throw new IllegalStateException("Fragment already added: " + nVar);
        }
        synchronized (this.f3985a) {
            this.f3985a.add(nVar);
        }
        nVar.mAdded = true;
    }

    void b() {
        this.f3986b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f3986b.get(str) != null;
    }

    void d(int i10) {
        for (b0 b0Var : this.f3986b.values()) {
            if (b0Var != null) {
                b0Var.s(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3986b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b0 b0Var : this.f3986b.values()) {
                printWriter.print(str);
                if (b0Var != null) {
                    n nVarK = b0Var.k();
                    printWriter.println(nVarK);
                    nVarK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3985a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = this.f3985a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(nVar.toString());
            }
        }
    }

    n f(String str) {
        b0 b0Var = this.f3986b.get(str);
        if (b0Var != null) {
            return b0Var.k();
        }
        return null;
    }

    n g(int i10) {
        for (int size = this.f3985a.size() - 1; size >= 0; size--) {
            n nVar = this.f3985a.get(size);
            if (nVar != null && nVar.mFragmentId == i10) {
                return nVar;
            }
        }
        for (b0 b0Var : this.f3986b.values()) {
            if (b0Var != null) {
                n nVarK = b0Var.k();
                if (nVarK.mFragmentId == i10) {
                    return nVarK;
                }
            }
        }
        return null;
    }

    n h(String str) {
        if (str != null) {
            for (int size = this.f3985a.size() - 1; size >= 0; size--) {
                n nVar = this.f3985a.get(size);
                if (nVar != null && str.equals(nVar.mTag)) {
                    return nVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (b0 b0Var : this.f3986b.values()) {
            if (b0Var != null) {
                n nVarK = b0Var.k();
                if (str.equals(nVarK.mTag)) {
                    return nVarK;
                }
            }
        }
        return null;
    }

    n i(String str) {
        n nVarFindFragmentByWho;
        for (b0 b0Var : this.f3986b.values()) {
            if (b0Var != null && (nVarFindFragmentByWho = b0Var.k().findFragmentByWho(str)) != null) {
                return nVarFindFragmentByWho;
            }
        }
        return null;
    }

    int j(n nVar) {
        View view;
        View view2;
        ViewGroup viewGroup = nVar.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f3985a.indexOf(nVar);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            n nVar2 = this.f3985a.get(i10);
            if (nVar2.mContainer == viewGroup && (view2 = nVar2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f3985a.size()) {
                return -1;
            }
            n nVar3 = this.f3985a.get(iIndexOf);
            if (nVar3.mContainer == viewGroup && (view = nVar3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<b0> k() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f3986b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
        }
        return arrayList;
    }

    List<n> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<b0> it = this.f3986b.values().iterator();
        while (it.hasNext()) {
            b0 next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    HashMap<String, Bundle> m() {
        return this.f3987c;
    }

    b0 n(String str) {
        return this.f3986b.get(str);
    }

    List<n> o() {
        ArrayList arrayList;
        if (this.f3985a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3985a) {
            arrayList = new ArrayList(this.f3985a);
        }
        return arrayList;
    }

    z p() {
        return this.f3988d;
    }

    Bundle q(String str) {
        return this.f3987c.get(str);
    }

    void r(b0 b0Var) {
        n nVarK = b0Var.k();
        if (c(nVarK.mWho)) {
            return;
        }
        this.f3986b.put(nVarK.mWho, b0Var);
        if (nVarK.mRetainInstanceChangedWhileDetached) {
            if (nVarK.mRetainInstance) {
                this.f3988d.a(nVarK);
            } else {
                this.f3988d.k(nVarK);
            }
            nVarK.mRetainInstanceChangedWhileDetached = false;
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + nVarK);
        }
    }

    void s(b0 b0Var) {
        n nVarK = b0Var.k();
        if (nVarK.mRetainInstance) {
            this.f3988d.k(nVarK);
        }
        if (this.f3986b.get(nVarK.mWho) == b0Var && this.f3986b.put(nVarK.mWho, null) != null && w.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + nVarK);
        }
    }

    void t() {
        Iterator<n> it = this.f3985a.iterator();
        while (it.hasNext()) {
            b0 b0Var = this.f3986b.get(it.next().mWho);
            if (b0Var != null) {
                b0Var.m();
            }
        }
        for (b0 b0Var2 : this.f3986b.values()) {
            if (b0Var2 != null) {
                b0Var2.m();
                n nVarK = b0Var2.k();
                if (nVarK.mRemoving && !nVarK.isInBackStack()) {
                    if (nVarK.mBeingSaved && !this.f3987c.containsKey(nVarK.mWho)) {
                        B(nVarK.mWho, b0Var2.q());
                    }
                    s(b0Var2);
                }
            }
        }
    }

    void u(n nVar) {
        synchronized (this.f3985a) {
            this.f3985a.remove(nVar);
        }
        nVar.mAdded = false;
    }

    void v() {
        this.f3986b.clear();
    }

    void w(List<String> list) {
        this.f3985a.clear();
        if (list != null) {
            for (String str : list) {
                n nVarF = f(str);
                if (nVarF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + nVarF);
                }
                a(nVarF);
            }
        }
    }

    void x(HashMap<String, Bundle> map) {
        this.f3987c.clear();
        this.f3987c.putAll(map);
    }

    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f3986b.size());
        for (b0 b0Var : this.f3986b.values()) {
            if (b0Var != null) {
                n nVarK = b0Var.k();
                B(nVarK.mWho, b0Var.q());
                arrayList.add(nVarK.mWho);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + nVarK + ": " + nVarK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> z() {
        synchronized (this.f3985a) {
            if (this.f3985a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3985a.size());
            for (n nVar : this.f3985a) {
                arrayList.add(nVar.mWho);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + nVar.mWho + "): " + nVar);
                }
            }
            return arrayList;
        }
    }
}

package g5;

import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebSettingsBoundaryInterface f11469a;

    public k0(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f11469a = webSettingsBoundaryInterface;
    }

    public int a() {
        return this.f11469a.getDisabledActionModeMenuItems();
    }

    public boolean b() {
        return this.f11469a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int c() {
        return this.f11469a.getForceDark();
    }

    public boolean d() {
        return this.f11469a.getOffscreenPreRaster();
    }

    public Set<String> e() {
        return this.f11469a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean f() {
        return this.f11469a.getSafeBrowsingEnabled();
    }

    public boolean g() {
        return this.f11469a.isAlgorithmicDarkeningAllowed();
    }

    public void h(boolean z10) {
        this.f11469a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void i(int i10) {
        this.f11469a.setDisabledActionModeMenuItems(i10);
    }

    public void j(boolean z10) {
        this.f11469a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    public void k(int i10) {
        this.f11469a.setForceDark(i10);
    }

    public void l(int i10) {
        this.f11469a.setForceDarkBehavior(i10);
    }

    public void m(boolean z10) {
        this.f11469a.setOffscreenPreRaster(z10);
    }

    public void n(Set<String> set) {
        this.f11469a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void o(boolean z10) {
        this.f11469a.setSafeBrowsingEnabled(z10);
    }
}

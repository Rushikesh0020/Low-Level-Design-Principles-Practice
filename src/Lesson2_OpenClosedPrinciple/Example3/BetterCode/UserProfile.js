import RoleViewMap from './RoleViewMap';
import StandardView from './StandardView';

const UserProfile = ({ user }) => {
    if (!user) return null;
    const ProfileView = RoleViewMap[user.role] || StandardView;
    return <ProfileView user={user} />
}

export default UserProfile;



/*
===========================
Code Comparison Summary
===========================

1. 📁 ProblematicCode
----------------------
- Role-based logic is embedded directly in the UserProfile component.
- Uses a `switch` or `if` statement inside the component.
- ❌ Violates the Open-Closed Principle (OCP).
- ❌ Hard to scale: adding a new role requires modifying the component.
- ❌ Poor separation of concerns.

2. 📁 ImprovedButNotOCPCompliant
--------------------------------
- Extracts role logic into a separate module (`ProfileViewSelector`).
- Still uses a `switch` statement inside the selector.
- ✅ Slightly better separation of concerns.
- ❌ Still violates OCP: new roles require modifying the selector.
- ❌ Initially had a bug: returned JSX instead of component reference (now fixed).
- ✅ Fixed version now works correctly by returning component references.

3. 📁 BetterCode
----------------
- Follows OCP fully using a Role-to-Component map (`RoleViewMap`).
- ✅ Adding new roles only requires updating the map — no logic modification.
- ✅ Clean and scalable design.
- ✅ Returns component references, not JSX.
- ✅ Stronger decoupling of role logic from component logic.
- Ideal for production or extensible systems.

*/


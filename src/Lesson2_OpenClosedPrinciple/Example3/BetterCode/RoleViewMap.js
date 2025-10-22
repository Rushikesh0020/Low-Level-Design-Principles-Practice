import AdminView from './AdminView';
import EditorView from './EditorView';

const RoleViewMap = {
    admin: AdminView,
    editor: EditorView,
    // Add more roles here, e.g.:
    // manager: ManagerView,
}

export default RoleViewMap;
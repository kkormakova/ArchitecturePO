package InMemoryModel;

import java.util.List;
import java.util.ArrayList;

import ModelElements.Scene;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;

    public ModelStore(iModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.cameras = new ArrayList<Camera>();
        this.flashes = new ArrayList<Flash>();
    }

    public Scene getScene(int id) {
        return scenes.get(id);
    }

    public void notifyChange(iModelChanger sender) {

    }
}

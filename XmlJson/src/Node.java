
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Node {
    private String name; // Nom de la balise
    private Map<String, String> attributes = new LinkedHashMap<>(); // Attributs de la balise
    private List<Node> children = new ArrayList<>(); // Enfants de la balise
    private String content; // Contenu texte de la balise

    // Constructeur
    public Node(String name) {
        this.name = name;
    }

    // Getter et setter pour le nom de la balise
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Ajouter un attribut
    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    // Récupérer les attributs
    public Map<String, String> getAttributes() {
        return attributes;
    }

    // Ajouter un enfant
    public void addChild(Node child) {
        children.add(child);
    }

    // Récupérer les enfants
    public List<Node> getChildren() {
        return children;
    }

    // Ajouter ou récupérer le contenu texte
    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Node{name='").append(name).append('\'');
        if (!attributes.isEmpty()) {
            builder.append(", attributes=").append(attributes);
        }
        if (content != null && !content.isEmpty()) {
            builder.append(", content='").append(content).append('\'');
        }
        if (!children.isEmpty()) {
            builder.append(", children=").append(children);
        }
        builder.append('}');
        return builder.toString();
    }
}

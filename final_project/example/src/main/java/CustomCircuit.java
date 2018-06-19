package main.java;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.unitgen.Circuit;
import com.jsyn.unitgen.PassThrough;
import com.jsyn.unitgen.UnitGenerator;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class CustomCircuit extends Circuit {
    public UnitOutputPort output;
    public UnitInputPort input;
    private String name;
    private PassThrough passThrough = new PassThrough();
    private Dictionary<String, UnitGenerator> generators = new Hashtable<>();

    public CustomCircuit(String name) {
        this.name = name;

        add(passThrough);
        addPort(output = passThrough.output);
        addPort(input = new UnitInputPort("Input"));
    }

    public String getName() {
        return name;
    }

    public void add(String name, UnitGenerator generator) {
        generators.put(name, generator);
        add(generator);
    }

    public Dictionary<String, UnitGenerator> getGenerators() {
        return generators;
    }

    public void combineOutputs() {
        passThrough.input.disconnectAll();

        Enumeration<UnitGenerator> e = generators.elements();
        while (e.hasMoreElements()) {
            UnitGenerator g = e.nextElement();

            UnitOutputPort port = (UnitOutputPort) g.getPortByName(UnitGenerator.PORT_NAME_OUTPUT);

            if (port == null) continue;

            passThrough.input.connect(port);
        }
    }
}

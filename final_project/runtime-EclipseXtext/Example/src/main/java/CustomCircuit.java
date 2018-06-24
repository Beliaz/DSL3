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
    private PassThrough outputPassThrough = new PassThrough();
    protected PassThrough inputPassThrough = new PassThrough();
    private Dictionary<String, UnitGenerator> generators = new Hashtable<>();

    public CustomCircuit(String name) {
        this.name = name;

        add(outputPassThrough);
        add(inputPassThrough);

        addPort(output = outputPassThrough.output);
        addPort(input = inputPassThrough.input);
    }

    public String getName() {
        return name;
    }

    public void add(String name, UnitGenerator generator) {
        generators.put(name.toLowerCase(), generator);
        add(generator);
    }

    public Dictionary<String, UnitGenerator> getGenerators() {
        return generators;
    }

    public void combineOutputs() {
        outputPassThrough.input.disconnectAll();

        Enumeration<UnitGenerator> e = generators.elements();
        while (e.hasMoreElements()) {
            UnitGenerator g = e.nextElement();

            UnitOutputPort port = (UnitOutputPort) g.getPortByName(UnitGenerator.PORT_NAME_OUTPUT);

            if (port == null) continue;

            outputPassThrough.input.connect(port);
        }
    }

    public UnitGenerator getGenerator(String name) {
        return generators.get(name.toLowerCase());
    }
}

import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

@customElement('vista-cambiar_contrasenna')
export class VistaCambiar_contrasenna extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing-s" style="width: 100%; height: 95%; align-self: center; justify-content: center; align-items: center;">
  <vaadin-password-field label="Nueva contraseña" value="secret1" id="inPass" style="width: 60%;" has-value></vaadin-password-field>
  <vaadin-password-field label="Repita la nueva contraseña" value="secret1" id="inPassRepeat" style="width: 60%;" has-value></vaadin-password-field>
  <vaadin-button style="margin-top: var(--lumo-space-l);" id="bGuardar">
    Guardar 
  </vaadin-button>
  <vaadin-button id="bCancelar">
   Cancelar
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

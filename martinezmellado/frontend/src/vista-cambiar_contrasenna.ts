import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comercial';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera_comercial style="width: 100%; height: 5%;"></vista-cabecera_comercial>
 <vaadin-vertical-layout theme="spacing-s" style="width: 100%; height: 95%; align-self: center; justify-content: center; align-items: center;">
  <vaadin-text-field label="Nueva contraseña" style="width: 60%;"></vaadin-text-field>
  <vaadin-text-field label="Repita la contraseña" style="width: 60%;"></vaadin-text-field>
  <vaadin-button style="margin-top: var(--lumo-space-l);">
   Guardar
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

import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-comentario__usuario_registrado__item')
export class VistaComentario__usuario_registrado__item extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%;">
 <iron-icon id="idFotoAutor" style="width: 50%; height: 100%;" icon="lumo:user"></iron-icon>
 <vaadin-horizontal-layout id="IdTextoComentario">
  <vaadin-vertical-layout theme="spacing" style="align-items: flex-start; justify-content: center; padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s);">
   <label>Comentario usuario: Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="justify-content: center; align-items: center; padding-right: var(--lumo-space-s);">
   <vaadin-button id="idMegusta">
    Me gusta 
   </vaadin-button>
   <vaadin-button id="IdDenunciar">
    Denunciar
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

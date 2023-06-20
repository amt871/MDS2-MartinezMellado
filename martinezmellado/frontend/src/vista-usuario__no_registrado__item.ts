import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuario__no_registrado__item')
export class VistaUsuario__no_registrado__item extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
 <vaadin-vertical-layout style="width: 30%; height: 30%;">
  <img id="image" style="max-width: 100%; max-height: 100%;">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: flex-start; justify-content: center; height: 100%;">
  <vaadin-horizontal-layout theme="spacing">
   <label id="NombreUsuario">Usuario </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center;">
   <label id="Seguidores" style="flex-shrink: 0; flex-grow: 1;">Seguidores </label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; align-self: center;">
  <label id="Descripcion" style="margin-left: var(--lumo-space-xl); flex-grow: 0; flex-shrink: 1;">Descripcion </label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
